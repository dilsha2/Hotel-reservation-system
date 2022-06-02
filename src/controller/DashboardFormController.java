package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class DashboardFormController {

    public AnchorPane anchorPaneDashboardContext;

    public void roomsOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) anchorPaneDashboardContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/RoomTableForm.fxml"))));
        stage.centerOnScreen();

    }
    public void mealOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) anchorPaneDashboardContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/MealTableForm.fxml"))));
        stage.centerOnScreen();
    }

    public void incomeOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) anchorPaneDashboardContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/IncomeTableForm.fxml"))));
        stage.centerOnScreen();
    }



    public void LogOutOnAction(ActionEvent actionEvent) throws IOException {
        Alert alert =  new Alert(Alert.AlertType.CONFIRMATION, "Are You Sure You Want To Log Out?", ButtonType.YES, ButtonType.NO);
        Optional<ButtonType> buttonType = alert.showAndWait();
        if (buttonType.get().equals(ButtonType.YES)){
            Stage stage = (Stage) anchorPaneDashboardContext.getScene().getWindow();
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AdminLoginForm.fxml"))));

        }else {}
    }
}
