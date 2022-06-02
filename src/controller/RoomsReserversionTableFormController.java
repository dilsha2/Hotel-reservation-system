package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import db.DatabaseIncome;
import db.DatabaseReserve;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Reserve;
import view.tm.ReserveTm;

import java.io.IOException;
import java.util.Optional;

public class RoomsReserversionTableFormController {
    public AnchorPane reservationContext;
    public TableView <ReserveTm>tblReservation;
    public TableColumn colCusName;
    public TableColumn colNic;
    public TableColumn colEmail;
    public TableColumn colContact;
    public TableColumn colAddress;
    public TableColumn colNumberRoom;
    public TableColumn colPlanMeal;
    public TableColumn colAvailability;
    public TableColumn colOption;
    public JFXTextField txtCusName;
    public JFXTextField txtNic;
    public JFXTextField txtEmail;
    public JFXTextField txtContact;
    public JFXTextField txtAddressRoom;
    public JFXTextField txtNumberRoom;
    public JFXTextField txtAvailability;
    public JFXButton btnSaveDetails;
    public JFXTextField txtMealPlan;

    public void initialize(){
        colCusName.setCellValueFactory(new PropertyValueFactory("cusName"));
        colNic.setCellValueFactory(new PropertyValueFactory("nic"));
        colEmail.setCellValueFactory(new PropertyValueFactory("email"));
        colContact.setCellValueFactory(new PropertyValueFactory("contact"));
        colAddress.setCellValueFactory(new PropertyValueFactory("address"));
        colNumberRoom.setCellValueFactory(new PropertyValueFactory("roomNumber"));
        colPlanMeal.setCellValueFactory(new PropertyValueFactory("mealPlan"));
        colAvailability.setCellValueFactory(new PropertyValueFactory("Availability"));
        colOption.setCellValueFactory(new PropertyValueFactory("btn"));
        LoadAllReserves();

        tblReservation.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            setData(newValue);
        });
    }

    private void setData(ReserveTm tm) {
        btnSaveDetails.setText("Update");
        txtCusName.setText(tm.getCusName());
        txtNic.setText(tm.getNic());
        txtEmail.setText(tm.getEmail());
        txtContact.setText(tm.getContact());
        txtAddressRoom.setText(tm.getAddress());
        txtNumberRoom.setText(tm.getRoomNumber());
        txtMealPlan.setText(tm.getMealPlan());
        txtAvailability.setText(tm.getAvailability());
    }

    private void LoadAllReserves() {
        ObservableList<ReserveTm> obList = FXCollections.observableArrayList();

        for (Reserve r: DatabaseReserve.reserveTable
             ) {
            Button btn = new Button("Delete");
            ReserveTm tm = new ReserveTm(r.getCusName(),r.getNic(),r.getEmail(),r.getContact(),r.getAddress(),r.getRoomNumber(),r.getMealPlan(),r.getAvailability(),btn);
            obList.add(tm);

            btn.setOnAction((e)->{

                Alert alert=new Alert(Alert.AlertType.CONFIRMATION,"Are You sure ?",
                        ButtonType.YES,ButtonType.NO);
                Optional<ButtonType> buttonType = alert.showAndWait();

                if(buttonType.get().equals(ButtonType.YES)){
                    DatabaseReserve.reserveTable.remove(r);
                    obList.remove(tm);
                }
            });
        }
        tblReservation.setItems(obList);
    }

    public void roomHomeOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) reservationContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReceptionDashboardForm.fxml"))));
        stage.centerOnScreen();
    }

    public void roomReserveNewOnAction(ActionEvent actionEvent) {
        btnSaveDetails.setText("Save Details");
    }

    public void btnSaveDetailsOnAction(ActionEvent actionEvent) {
        if (btnSaveDetails.getText().equals("Save Details")){
            Reserve r=new Reserve(
              txtCusName.getText(),
              txtNic.getText(),
              txtEmail.getText(),
              txtContact.getText(),
              txtAddressRoom.getText(),
              txtNumberRoom.getText(),
              txtMealPlan.getText(),
              txtAvailability.getText());

              DatabaseReserve.reserveTable.add(r);
              LoadAllReserves();

        }else{}
    }
}
