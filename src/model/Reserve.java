package model;

public class Reserve {
    private String cusName;
    private String nic;
    private String email;
    private String contact;
    private String address;
    private String roomNumber;
    private String mealPlan;
    private String Availability;

    public Reserve() {
    }

    public Reserve(String cusName, String nic, String email, String contact, String address, String roomNumber, String mealPlan, String availability) {
        this.cusName = cusName;
        this.nic = nic;
        this.email = email;
        this.contact = contact;
        this.address = address;
        this.roomNumber = roomNumber;
        this.mealPlan = mealPlan;
        Availability = availability;
    }



    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getMealPlan() {
        return mealPlan;
    }

    public void setMealPlan(String mealPlan) {
        this.mealPlan = mealPlan;
    }

    public String getAvailability() {
        return Availability;
    }

    public void setAvailability(String availability) {
        Availability = availability;
    }

    @Override
    public String toString() {
        return "Reserve{" +
                "cusName='" + cusName + '\'' +
                ", nic='" + nic + '\'' +
                ", email='" + email + '\'' +
                ", contact='" + contact + '\'' +
                ", address='" + address + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", mealPlan='" + mealPlan + '\'' +
                ", Availability='" + Availability + '\'' +
                '}';
    }
}
