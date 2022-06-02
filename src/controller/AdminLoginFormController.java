package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminLoginFormController {
    public JFXTextField userNameTxt;
    public JFXPasswordField pwdPassword;
    public AnchorPane loginFormContext;
    public JFXButton adminBtn;
    public JFXButton receptionBtn;


    int attempts = 0;
    int receptionAttempts = 0;

    public void loginAdminOnAction(ActionEvent actionEvent) throws IOException {
        if (adminBtn.getText().equals("Log in Admin")) {
            attempts++;
            if (attempts <= 3) {
                if (userNameTxt.getText().equals("admin") && pwdPassword.getText().equals("1234")) {
                    Stage stage = (Stage) loginFormContext.getScene().getWindow();
                    stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DashboardForm.fxml"))));
                } else {
                    new Alert(Alert.AlertType.WARNING, "TRY AGAIN").show();
                }
            } else {
                userNameTxt.setEditable(false);
                pwdPassword.setEditable(false);
            }
        } else {

        }
        if (adminBtn.getText().equals("Log in Receptionist")){
            receptionAttempts++;
            if (receptionAttempts <=3 ){
                if (userNameTxt.getText().equals("reception") && pwdPassword.getText().equals("4321")){
                    Stage stage = (Stage) loginFormContext.getScene().getWindow();
                    stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReceptionDashboardForm.fxml"))));

                }else{
                    new Alert(Alert.AlertType.WARNING,"Try Again").show();
                }

            }else{
                userNameTxt.setVisible(false);
                pwdPassword.setVisible(false);
            }
        }else {}
    }



    public void LoginReceptionistOnAction(ActionEvent actionEvent) {
        String temp =adminBtn.getText();
        adminBtn.setText(receptionBtn.getText());
        receptionBtn.setText(temp);
    }
}
