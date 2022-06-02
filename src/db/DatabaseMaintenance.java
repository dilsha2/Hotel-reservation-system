package db;

import model.maintenance;

import java.util.ArrayList;

public class DatabaseMaintenance {
    public static ArrayList<maintenance> maintenanceTable=new ArrayList<maintenance>();

    static {
        maintenanceTable.add(
                new maintenance("Room No-1","9.00 am","Available","Done")
        );

        maintenanceTable.add(
                new maintenance("Room No-2","10.00 am","Unavailable","pending")
        );

        maintenanceTable.add(
                new maintenance("Room No-3","11.00 am","Available","pending")
        );

        maintenanceTable.add(
                new maintenance("Room No-4","12.00pm","Available","Done")
        );
    }
}
