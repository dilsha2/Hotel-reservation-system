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

public class ReceptionDashboardFormController {
    public AnchorPane MaintenanceContext;

    public void roomsReservationOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) MaintenanceContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/RoomsReserversionTableForm.fxml"))));
        stage.centerOnScreen();

    }

    public void maintananceOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) MaintenanceContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/maintananceRoomForm.fxml"))));
        stage.centerOnScreen();
    }

    public void loginOutOnAction(ActionEvent actionEvent) throws IOException {
        Alert alert =  new Alert(Alert.AlertType.CONFIRMATION, "Are You Sure You Want To Log Out?", ButtonType.YES, ButtonType.NO);
        Optional<ButtonType> buttonType = alert.showAndWait();
        if (buttonType.get().equals(ButtonType.YES)){
            Stage stage = (Stage) MaintenanceContext.getScene().getWindow();
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AdminLoginForm.fxml"))));

        }else {}
    }

}
