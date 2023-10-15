package introToApi;
import java.util.*;
import java.util.Date;
public class date221 {
    public static void main(String[] args) {
        Date dt= new Date();
        System.out.println(dt);

        long Timeinms=dt.getTime();
        java.sql.Date dt1= new java.sql.Date(Timeinms);
        // System.out.println("------");
        // System.out.println(dt1);
        // java.sql.Date=dt1 new java.sql.Date(Timeinms);

    }
}
