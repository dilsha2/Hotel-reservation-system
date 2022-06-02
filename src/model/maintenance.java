package model;

public class maintenance {
    private String roomNo;
    private String cleanTime;
    private String available;
    private String status;

    public maintenance() {
    }

    public maintenance(String roomNo, String cleanTime, String available, String status) {
        this.roomNo = roomNo;
        this.cleanTime = cleanTime;
        this.available = available;
        this.status = status;
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

    @Override
    public String toString() {
        return "maintenance{" +
                "roomNo='" + roomNo + '\'' +
                ", cleanTime='" + cleanTime + '\'' +
                ", available='" + available + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
