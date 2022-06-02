package db;

import com.sun.deploy.appcontext.AppContext;
import com.sun.deploy.net.MessageHeader;
import model.Customer;

import java.util.ArrayList;

public class Database {
    public static ArrayList<Customer> roomTable = new ArrayList<Customer>();

    static {
        roomTable.add(
               new Customer("ROOM NO-1","Single","C A D Prasanna","200131110016","2021-1-4","8.00am")
       );

        roomTable.add(
                new Customer("ROOM NO-2","Double","D Madushan","200131110016","2021-1-4","9.00am")
        );

        roomTable.add(
                new Customer("ROOM NO-3","Triple","R Dashintha","200131110016","2021-1-9","12.00pm")
        );

        roomTable.add(
                new Customer("ROOM NO-4","Double","Nuwan silva","200131110016","2021-1-9","1.00pm")
        );

        roomTable.add(
                new Customer("ROOM NO-5","Single","S Kalum","200131110016","2021-1-10","7.00pm")
        );

   }

}
