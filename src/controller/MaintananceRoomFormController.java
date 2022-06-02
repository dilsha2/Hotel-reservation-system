package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import db.DatabaseMaintenance;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.maintenance;
import view.tm.CustomerTM;
import view.tm.maintenanceTm;

import java.io.IOException;
import java.util.Optional;

public class MaintananceRoomFormController {


    public AnchorPane maintenanceContext;
    public TableView<maintenanceTm> tblMaintenance;
    public TableColumn colRoomNo;
    public TableColumn colCleaningTime;
    public TableColumn colAvailable;
    public TableColumn colStatus;
    public TableColumn colOptions;
    public JFXTextField txtRoomNo;
    public JFXTextField txtCleaningTime;
    public JFXTextField txtAvailable;
    public JFXTextField txtStatus;
    public JFXButton btnmaintenanceSave;

    public void initialize(){
        colRoomNo.setCellValueFactory(new PropertyValueFactory("roomNo"));
        colCleaningTime.setCellValueFactory(new PropertyValueFactory("cleanTime"));
        colAvailable.setCellValueFactory(new PropertyValueFactory("available"));
        colStatus.setCellValueFactory(new PropertyValueFactory("status"));
        colOptions.setCellValueFactory(new PropertyValueFactory("btn"));
        LoadAllMaintenance();

        tblMaintenance.getSelectionModel().selectedItemProperty()
                .addListener((observable, oldValue, newValue) -> {
                    setData(newValue);
                });
    }

    private void setData(maintenanceTm tm) {
        btnmaintenanceSave.setText("Update");
        txtRoomNo.setText(tm.getRoomNo());
        txtCleaningTime.setText(tm.getCleanTime());
        txtAvailable.setText(tm.getAvailable());
        txtStatus.setText(tm.getStatus());

    }

    private void LoadAllMaintenance() {
        ObservableList<maintenanceTm> obList = FXCollections.observableArrayList();

        for (maintenance m : DatabaseMaintenance.maintenanceTable
        ) {
            Button btn = new Button("Delete");
            maintenanceTm tm = new maintenanceTm(m.getRoomNo(), m.getCleanTime(), m.getAvailable(), m.getStatus(), btn);
            obList.add(tm);

            btn.setOnAction((e) -> {
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you Sure", ButtonType.YES, ButtonType.NO);
                Optional<ButtonType> buttonType = alert.showAndWait();
                if (buttonType.get().equals(ButtonType.YES)) {
                    DatabaseMaintenance.maintenanceTable.remove(m);
                    obList.remove(tm);

                }
            });
        }
        tblMaintenance.setItems(obList);
    }


    public void maintenanceNewOnAction(ActionEvent actionEvent) {
        btnmaintenanceSave.setText("Save");

    }

    public void maintenanceSaveOnAction(ActionEvent actionEvent) {
        if (btnmaintenanceSave.getText().equals("Save")){
            maintenance m1 = new maintenance(
                    txtRoomNo.getText(),
                    txtCleaningTime.getText(),
                    txtAvailable.getText(),
                    txtStatus.getText()
            );
            DatabaseMaintenance.maintenanceTable.add(m1);
            LoadAllMaintenance();
        }
    }

    public void maintenanceHomeOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) maintenanceContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReceptionDashboardForm.fxml"))));
        stage.centerOnScreen();
    }
}
