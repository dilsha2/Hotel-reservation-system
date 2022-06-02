package view.tm;

import javafx.scene.control.Button;

public class maintenanceTm {
    private String roomNo;
    private String cleanTime;
    private String available;
    private String status;
    private Button btn;

    public maintenanceTm() {
    }

    public maintenanceTm(String roomNo, String cleanTime, String available, String status, Button btn) {
        this.roomNo = roomNo;
        this.cleanTime = cleanTime;
        this.available = available;
        this.status = status;
        this.btn = btn;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getCleanTime() {
        return cleanTime;
    }

    public void setCleanTime(String cleanTime) {
        this.cleanTime = cleanTime;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }

    @Override
    public String toString() {
        return "maintenanceTm{" +
                "roomNo='" + roomNo + '\'' +
                ", cleanTime='" + cleanTime + '\'' +
                ", available='" + available + '\'' +
                ", status='" + status + '\'' +
                ", btn=" + btn +
                '}';
    }
}
