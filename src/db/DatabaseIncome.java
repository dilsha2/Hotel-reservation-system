package db;

import model.income;

import java.util.ArrayList;

public class DatabaseIncome {
    public static ArrayList<income> incomeTable=new ArrayList<income>();

    static {
        incomeTable.add(
                new income("January",10000.00,15000.00,65000.00,0.0,0.0)
        );

        incomeTable.add(
                new income("February",12000.00,15000.00,15000.00,0.0,0.0)
        );

        incomeTable.add(
                new income("March",15000.00,15000.00,15000.00,0.0,0.0)
        );

        incomeTable.add(
                new income("April",14000.00,15000.00,25000.00,0.0,0.0)
        );

        incomeTable.add(
                new income("May",10000.00,15000.00,45000.00,0.0,0.0)
        );

        incomeTable.add(
                new income("June",9000.00,80000.00,95000.00,0.0,0.0)
        );

        incomeTable.add(
                new income("July",18000.00,22000.00,85000.00,0.0,0.0)
        );

        incomeTable.add(
                new income("August",20000.00,133000.00,75000.00,0.0,0.0)
        );

        incomeTable.add(
                new income("September",50000.00,188000.00,65000.00,0.0,0.0)
        );

        incomeTable.add(
                new income("October",80000.00,180000.00,57000.00,0.0,0.0)
        );

        incomeTable.add(
                new income("November",100000.00,150000.00,50000.00,0.0,0.0)
        );

        incomeTable.add(
                new income("December",150000.00,250000.00,50000.00,0.0,0.0)
        );
    }
}
