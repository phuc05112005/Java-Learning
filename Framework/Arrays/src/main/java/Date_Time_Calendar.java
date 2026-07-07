import java.sql.Date;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Date_Time_Calendar {

    public static void main(String[] args) {
        // Ham lay thoi gian hien tai
        long t1 = System.currentTimeMillis();
        System.out.println(t1);
//
//        for(int i = 0; i<1000000; i++){
//            System.out.println(i);
//        }
//
//        long t2 = System.currentTimeMillis();
//        System.out.println(((t2-t1)/1000) + "s");


        // TimeUnit
        System.out.println("3000 nam = " + TimeUnit.DAYS.toSeconds(3000*365) + "s");
        System.out.println("25h = " + TimeUnit.HOURS.toSeconds(25) + "s");


        // Date
        Date date = new Date(t1);
        System.out.println(date);
        System.out.println(date.getDate() + "/" + (date.getMonth()+1) + "/" + (date.getYear()+1900));


        // Calendar
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.DAY_OF_MONTH) + "/" +(c.get(Calendar.MONTH) + 1) + "/" + c.get(Calendar.YEAR));
    }
}
