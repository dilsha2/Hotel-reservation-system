package view.tm;

import javafx.scene.control.Button;

public class incomeTm {
    private String month;
    private double roomCharge;
    private double mealCharge;
    private double serviceCharge;
    private Button btn;
    private double monthlyIncome;
    private double annuallyIncome;

    public incomeTm() {
    }

    public incomeTm(String month, double roomCharge, double mealCharge, double serviceCharge, Button btn, double monthlyIncome, double annuallyIncome) {
        this.month = month;
        this.roomCharge = roomCharge;
        this.mealCharge = mealCharge;
        this.serviceCharge = serviceCharge;
        this.btn = btn;
        this.monthlyIncome = monthlyIncome;
        this.annuallyIncome = annuallyIncome;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public double getRoomCharge() {
        return roomCharge;
    }

    public void setRoomCharge(double roomCharge) {
        this.roomCharge = roomCharge;
    }

    public double getMealCharge() {
        return mealCharge;
    }

    public void setMealCharge(double mealCharge) {
        this.mealCharge = mealCharge;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public double getAnnuallyIncome() {
        return annuallyIncome;
    }

    public void setAnnuallyIncome(double annuallyIncome) {
        this.annuallyIncome = annuallyIncome;
    }

    @Override
    public String toString() {
        return "incomeTm{" +
                "month='" + month + '\'' +
                ", roomCharge=" + roomCharge +
                ", mealCharge=" + mealCharge +
                ", serviceCharge=" + serviceCharge +
                ", btn=" + btn +
                ", monthlyIncome=" + monthlyIncome +
                ", annuallyIncome=" + annuallyIncome +
                '}';
    }
}
