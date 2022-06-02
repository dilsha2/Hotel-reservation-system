package db;

import model.Meal;

import java.util.ArrayList;

public class DatabaseMeal {
    public static ArrayList<Meal> mealTable = new ArrayList<Meal>();

    static {
        mealTable.add(
                new Meal("Room No-1","Local","Lunch","1","Rs.1800.00","Available")
        );

        mealTable.add(
                new Meal("Room No-2","Chinese","Dinner","1","Rs.3000.00","Available")
        );

        mealTable.add(
                new Meal("Room No-3","Local","Breakfast","3","Rs.5400.00","Available")
        );

        mealTable.add(
                new Meal("Room No-4","French","Lunch","1","Rs.4000.00","Unavailable")
        );

        mealTable.add(
                new Meal("Room No-5","Local","Dinner,Lunch","4","Rs.9000.00","Available")
        );
    }


}
