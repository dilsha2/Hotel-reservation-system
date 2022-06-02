package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import db.Database;
import db.DatabaseIncome;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.income;
import view.tm.incomeTm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;

public class IncomeTableFormController {
    public JFXTextField txtMonth;
    public JFXTextField txtRoomCharge;
    public JFXTextField txtMealCharge;
    public JFXTextField txtServiceCharge;
    public JFXButton btnSaving;
    public TableView<incomeTm> tblIncome;
    public TableColumn colMonth;
    public TableColumn colRoomCharge;
    public TableColumn colMealCharge;
    public TableColumn colServiceCharge;
    public TableColumn colOption;
    public TableColumn colIncome;
    public TableColumn colAnnuallyIncome;
    public AnchorPane incomeContext;


    public void initialize(){
        colMonth.setCellValueFactory(new PropertyValueFactory("month"));
        colRoomCharge.setCellValueFactory(new PropertyValueFactory("roomCharge"));
        colMealCharge.setCellValueFactory(new PropertyValueFactory("mealCharge"));
        colServiceCharge.setCellValueFactory(new PropertyValueFactory("serviceCharge"));
        colOption.setCellValueFactory(new PropertyValueFactory("btn"));
        colIncome.setCellValueFactory(new PropertyValueFactory("monthlyIncome"));
        colAnnuallyIncome.setCellValueFactory(new PropertyValueFactory("annuallyIncome"));
        LoadAllIncome();

        tblIncome.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            setData(newValue);
        });
    }

    private void setData(incomeTm tm) {
        btnSaving.setText("Update");
        txtMonth.setText(tm.getMonth());
        txtRoomCharge.setText(String.valueOf(tm.getRoomCharge()));
        txtMealCharge.setText(String.valueOf(tm.getMealCharge()));
        txtServiceCharge.setText(String.valueOf(tm.getServiceCharge()));

    }



    private void LoadAllIncome() {
        ObservableList<incomeTm> obList= FXCollections.observableArrayList();

        for (income i: DatabaseIncome.incomeTable) {
            Button btn=new Button("Delete");
            incomeTm tm = new incomeTm(i.getMonth(), i.getRoomCharge(), i.getMealCharge(),i.getServiceCharge(),btn,i.getMonthlyIncome(),i.getAnnuallyIncome());
            obList.add(tm);

            btn.setOnAction((e)->{

                Alert alert=new Alert(Alert.AlertType.CONFIRMATION,"Are You sure ?",
                        ButtonType.YES,ButtonType.NO);
                Optional<ButtonType> buttonType = alert.showAndWait();

                if(buttonType.get().equals(ButtonType.YES)){
                    //delete to alert action
                    DatabaseIncome.incomeTable.remove(i);
                    obList.remove(tm);
                }
            });
        }
        tblIncome.setItems(obList);
    }

    public void goBackOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) incomeContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DashboardForm.fxml"))));
        stage.centerOnScreen();
    }

    public void monthlyIncomeOnAction(ActionEvent actionEvent) {
    }

    public void anuallyIncomeOnAction(ActionEvent actionEvent) {
    }

    public void btnSaveChargesOnAction(ActionEvent actionEvent) {
        if(btnSaving.getText().equals("Save")){
            income i1 = new income(
                    txtMonth.getText(),
                    Double.parseDouble(txtRoomCharge.getText()),
                    Double.parseDouble(txtMealCharge.getText()),
                    Double.parseDouble(txtServiceCharge.getText()));

            DatabaseIncome.incomeTable.add(i1);
            LoadAllIncome();
        }else{}
    }
    public void newOnAction(ActionEvent actionEvent) {
        btnSaving.setText("Save");
    }
}
