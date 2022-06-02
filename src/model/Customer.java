package model;

public class Customer {
    private String roomNo;
    private String roomType;
    private String name;
    private String nic;
    private String date;
    private String time;

    public Customer(String roomNo, String roomType, String name, String nic, String date, String time) {
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.name = name;
        this.nic = nic;
        this.date = date;
        this.time = time;
    }

    public Customer() {

    }


    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "roomNo='" + roomNo + '\'' +
                ", roomType='" + roomType + '\'' +
                ", name='" + name + '\'' +
                ", nic='" + nic + '\'' +
                ", date=" + date +
                ", time='" + time + '\'' +
                '}';
    }
}
