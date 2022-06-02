package db;

import model.Reserve;

import java.util.ArrayList;

public class DatabaseReserve {
    public static ArrayList<Reserve> reserveTable = new ArrayList<Reserve>();

    static {
        reserveTable.add(
                new Reserve("Dilsha","200131110016","dilsha@gmail.com","+94765660311","Panadura","Room No-1","Local","Available")
        );

        reserveTable.add(
                new Reserve("Ishara","200131110016","ishara@gmail.com","+94765550311","Galle","Room No-2","Chinese","Available")
        );

        reserveTable.add(
                new Reserve("Nipun","200131110016","nipun@gmail.com","+94765220311","Kandy","Room No-3","French","Available")
        );

        reserveTable.add(
                new Reserve("Kamil","200131110016","kamil@gmail.com","+94765664311","Kurunagala","Room No-4","Chinese","Available")
        );

        reserveTable.add(
                new Reserve("Dilip","200131110016","dilip@gmail.com","+94765660310","Colombo","Room No-5","Local","Available")
        );
    }
}
