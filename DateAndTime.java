import java.util.Date;
import java.text.SimpleDateFormat;

public class DateAndTime {
    public static void main(String[] args) {

        // Current date and time
        Date date = new Date();
        System.out.println("Default Date      : " + date);

        // Format date
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Formatted Date    : " + sdf1.format(date));

        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Formatted Time    : " + sdf2.format(date));

        SimpleDateFormat sdf3 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println("Date & Time       : " + sdf3.format(date));

        // Get time in milliseconds
        System.out.println("Time in ms        : " + date.getTime());

        // Compare two dates
        Date date1 = new Date();
        Date date2 = new Date(date1.getTime() + 10000); // 10 seconds ahead

        System.out.println("\ndate1 before date2: " + date1.before(date2));
        System.out.println("date1 after  date2: " + date1.after(date2));
        System.out.println("date1 equals date2: " + date1.equals(date2));
    }
}