package model;

import javafx.scene.control.Button;

public class Meal {
    private String roomNo;
    private String mealType;
    private String mealTime;
    private String Portions;
    private String price;
    private String mealStatus;

    public Meal() {
    }

    public Meal(String roomNo, String mealType, String mealTime, String portions, String price, String mealStatus) {
        this.roomNo = roomNo;
        this.mealType = mealType;
        this.mealTime = mealTime;
        Portions = portions;
        this.price = price;
        this.mealStatus = mealStatus;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public String getMealTime() {
        return mealTime;
    }

    public void setMealTime(String mealTime) {
        this.mealTime = mealTime;
    }

    public String getPortions() {
        return Portions;
    }

    public void setPortions(String portions) {
        Portions = portions;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getMealStatus() {
        return mealStatus;
    }

    public void setMealStatus(String mealStatus) {
        this.mealStatus = mealStatus;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "roomNo='" + roomNo + '\'' +
                ", mealType='" + mealType + '\'' +
                ", mealTime='" + mealTime + '\'' +
                ", Portions='" + Portions + '\'' +
                ", price='" + price + '\'' +
                ", mealStatus='" + mealStatus + '\'' +
                '}';
    }


}
