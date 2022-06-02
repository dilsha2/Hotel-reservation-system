package model;

public class income {
    private String month;
    private double roomCharge;
    private double mealCharge;
    private double serviceCharge;
    private double monthlyIncome;
    private double annuallyIncome;

    public income() {
    }

    public income(String month, double roomCharge, double mealCharge, double serviceCharge, double monthlyIncome, double annuallyIncome) {
        this.month = month;
        this.roomCharge = roomCharge;
        this.mealCharge = mealCharge;
        this.serviceCharge = serviceCharge;
        this.monthlyIncome = monthlyIncome;
        this.annuallyIncome = annuallyIncome;
    }

    public income(String text, double parseDouble, double parseDouble1, double parseDouble2) {
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
        return "income{" +
                "month='" + month + '\'' +
                ", roomCharge=" + roomCharge +
                ", mealCharge=" + mealCharge +
                ", serviceCharge=" + serviceCharge +
                ", monthlyIncome=" + monthlyIncome +
                ", annuallyIncome=" + annuallyIncome +
                '}';
    }
}
