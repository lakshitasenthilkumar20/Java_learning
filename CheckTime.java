import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckTime {
    static void checkTime(String inputTimeStr) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        Date inputTime = sdf.parse(inputTimeStr);
        Date currentTime = sdf.parse(sdf.format(new Date()));

        System.out.println("Input Time   : " + inputTimeStr);
        System.out.println("Current Time : " + sdf.format(currentTime));

        if (inputTime.after(currentTime)) {
            System.out.println("Result: Input time is GREATER than current time.");
        } else if (inputTime.before(currentTime)) {
            System.out.println("Result: Input time is LESS than current time.");
        } else {
            System.out.println("Result: Input time is EQUAL to current time.");
        }
    }

    public static void main(String[] args) throws ParseException {
        checkTime("10:00");
        System.out.println();
        checkTime("23:59");
    }
}