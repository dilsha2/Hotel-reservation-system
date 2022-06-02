package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import db.Database;
import db.DatabaseMeal;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Meal;
import view.tm.MealTm;

import java.io.IOException;
import java.util.Optional;

public class MealTableFormController {
    public TableView <MealTm> tblMeal;
    public TableColumn colRoomsNumber;
    public TableColumn colMealType;
    public TableColumn colMealTIme;
    public TableColumn colOrderPortions;
    public TableColumn colPrice;
    public TableColumn colMealStatus;
    public TableColumn colOptions;
    public JFXTextField txtRoom;
    public JFXTextField txtMealType;
    public JFXTextField txtMealTime;
    public JFXTextField txtOrderdPortions;
    public JFXTextField txtPrice;
    public JFXTextField txtStatus;
    public JFXButton btnSave;
    public AnchorPane mealContext;

    public void initialize(){
        colRoomsNumber.setCellValueFactory(new PropertyValueFactory("roomNo"));
        colMealType.setCellValueFactory(new PropertyValueFactory("mealType"));
        colMealTIme.setCellValueFactory(new PropertyValueFactory("mealTime"));
        colOrderPortions.setCellValueFactory(new PropertyValueFactory("Portions"));
        colPrice.setCellValueFactory(new PropertyValueFactory("price"));
        colMealStatus.setCellValueFactory(new PropertyValueFactory("mealStatus"));
        colOptions.setCellValueFactory(new PropertyValueFactory("btn"));
        LoadAllMeals();

        tblMeal.getSelectionModel().selectedItemProperty()
                .addListener((observable, oldValue, newValue) -> {
                    setData(newValue);
                });
    }

    private void setData(MealTm tm) {
        btnSave.setText("Update");
        txtRoom.setText(tm.getRoomNo());
        txtMealType.setText(tm.getMealType());
        txtMealTime.setText(tm.getMealTime());
        txtOrderdPortions.setText(tm.getPortions());
        txtPrice.setText(tm.getPrice());
        txtStatus.setText(tm.getMealStatus());

        
    }

    private void LoadAllMeals() {
        ObservableList<MealTm> obList = FXCollections.observableArrayList();

        for (Meal m: DatabaseMeal.mealTable
             ) {
            Button btn=new Button("Delete");
            MealTm tm=new MealTm(m.getRoomNo(),m.getMealType(),m.getMealTime(),m.getPortions(),m.getPrice(),m.getMealStatus(),btn);
            obList.add(tm);

            btn.setOnAction((e) ->{
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are You Sure?", ButtonType.YES,ButtonType.NO);
                Optional<ButtonType> buttonType = alert.showAndWait();

                if (buttonType.get().equals(ButtonType.YES)){
                    DatabaseMeal.mealTable.remove(m);
                    obList.remove(tm);
                }

            });
        }
        tblMeal.setItems(obList);
    }

    public void btnSaveOnAction(ActionEvent actionEvent) {
        if (btnSave.getText().equals("Save")){
            Meal m1 = new Meal(
                    txtRoom.getText(),
                    txtMealType.getText(),
                    txtMealTime.getText(),
                    txtOrderdPortions.getText(),
                    txtPrice.getText(),
                    txtStatus.getText()
            );
            DatabaseMeal.mealTable.add(m1);
            LoadAllMeals();

        }else {

        }

    }

    public void btnNewOnAction(ActionEvent actionEvent) {
        btnSave.setText("Save");
    }

    public void backToHomeOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) mealContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DashboardForm.fxml"))));
        stage.centerOnScreen();
    }
}
