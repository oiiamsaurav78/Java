package introToApi;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.*;
public class date222 {
    public static void main(String[] args) {
        LocalDate date= LocalDate.now();
        int day=date.getDayOfMonth();
        int month=date.getMonthValue();
        int year= date.getYear();
        System.out.println(day+"/"+month+"/"+year);

        LocalTime time= LocalTime.now();
        // System.out.println(time);
        int hour= time.getHour();
        int minute= time.getMinute();
        int sec= time.getSecond();
        System.out.println(hour+":"+minute+":"+sec);
        // DateTimeFormatter df= DateTimeFormatter.ISO_DATE();
        LocalDateTime dt= LocalDateTime.now();
        DateTimeFormatter df= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter df2= DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        
        String Mydate= dt.format(df2);
        System.out.println(Mydate);

    }
}
