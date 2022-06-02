package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import db.Database;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Customer;
import view.tm.CustomerTM;

import java.io.IOException;
import java.util.Optional;


public class RoomTableFormController {

    public TableView<CustomerTM> tblRoom;
    public TableColumn colRoomNo;
    public TableColumn colRoomType;
    public TableColumn colCustomernName;
    public TableColumn colCustomerNic;
    public TableColumn colDate;
    public TableColumn colTime;
    public TableColumn colOption;
    public JFXTextField txtRoomNo;
    public JFXTextField txtRoomType;
    public JFXTextField txtCustomerName;
    public JFXTextField txtCustomerNic;
    public JFXTextField txtDate;
    public JFXTextField txtTime;
    public JFXButton btnSaveCustomer;
    public AnchorPane roomsTableContext;

    public void initialize(){
        colRoomNo.setCellValueFactory(new PropertyValueFactory("roomNo"));
        colRoomType.setCellValueFactory(new PropertyValueFactory("roomType"));
        colCustomernName.setCellValueFactory(new PropertyValueFactory("name"));
        colCustomerNic.setCellValueFactory(new PropertyValueFactory("nic"));
        colDate.setCellValueFactory(new PropertyValueFactory("date"));
        colTime.setCellValueFactory(new PropertyValueFactory("time"));
        colOption.setCellValueFactory(new PropertyValueFactory("btn"));
        loadAllCustomers();

        tblRoom.getSelectionModel().selectedItemProperty()
                .addListener((observable, oldValue, newValue) -> {
                    setData(newValue);
                });
    }

    private void setData(CustomerTM tm) {
        btnSaveCustomer.setText("Update");
        txtRoomNo.setText(tm.getRoomNo());
        txtRoomType.setText(tm.getRoomType());
        txtCustomerName.setText(tm.getName());
        txtCustomerNic.setText(tm.getNic());
        txtDate.setText(tm.getDate());
        txtTime.setText(tm.getTime());

    }

    private void loadAllCustomers() {
        ObservableList<CustomerTM> obList = FXCollections.observableArrayList();

        for (Customer c: Database.roomTable
             ) {
            Button btn = new Button("Delete");
            CustomerTM tm=new CustomerTM(c.getRoomNo(),c.getRoomType(),c.getName(),c.getNic(),c.getDate(),c.getTime(),btn);
            obList.add(tm);

            btn.setOnAction((e) ->{
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you Sure",ButtonType.YES , ButtonType.NO);
                Optional<ButtonType> buttonType = alert.showAndWait();
                if (buttonType.get().equals(ButtonType.YES)){
                    Database.roomTable.remove(c);
                    obList.remove(tm);

                }
            });
        }
        tblRoom.setItems(obList);
    }

    public void btnSaveCustomerOnAction(ActionEvent actionEvent) {
        if (btnSaveCustomer.getText().equals("Save Customer")) {
            Customer c1 = new Customer(
                    txtRoomNo.getText(),
                    txtRoomType.getText(),
                    txtCustomerName.getText(),
                    txtCustomerNic.getText(),
                    txtDate.getText(),
                    txtTime.getText()
            );
            Database.roomTable.add(c1);
            loadAllCustomers();
        } else {

        }
    }

    public void btnNewCustomerOnAction(ActionEvent actionEvent) {
            btnSaveCustomer.setText("Save Customer");
        }

    public void homeOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) roomsTableContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DashboardForm.fxml"))));
        stage.centerOnScreen();
    }
}
