package view.tm;

import javafx.scene.control.Button;

public class MealTm {
    private String roomNo;
    private String mealType;
    private String mealTime;
    private String Portions;
    private String price;
    private String mealStatus;
    private Button btn;

    public MealTm() {
    }

    public MealTm(String roomNo, String mealType, String mealTime, String portions, String price, String mealStatus, Button btn) {
        this.roomNo = roomNo;
        this.mealType = mealType;
        this.mealTime = mealTime;
        Portions = portions;
        this.price = price;
        this.mealStatus = mealStatus;
        this.btn = btn;
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

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }

    @Override
    public String toString() {
        return "MealTm{" +
                "roomNo='" + roomNo + '\'' +
                ", mealType='" + mealType + '\'' +
                ", mealTime='" + mealTime + '\'' +
                ", Portions='" + Portions + '\'' +
                ", price='" + price + '\'' +
                ", mealStatus='" + mealStatus + '\'' +
                ", btn=" + btn +
                '}';
    }
}
