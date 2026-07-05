import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {

        // Get current Calendar instance
        Calendar cal = Calendar.getInstance();

        // Get individual fields
        System.out.println("Year        : " + cal.get(Calendar.YEAR));
        System.out.println("Month       : " + (cal.get(Calendar.MONTH) + 1)); // Month is 0-based
        System.out.println("Day         : " + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("Hour        : " + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute      : " + cal.get(Calendar.MINUTE));
        System.out.println("Second      : " + cal.get(Calendar.SECOND));
        System.out.println("Day of Week : " + cal.get(Calendar.DAY_OF_WEEK)); // 1=Sunday

        // Add days
        cal.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println("\nDate after 5 days : " + cal.getTime());

        // Subtract months
        cal.add(Calendar.MONTH, -2);
        System.out.println("Date minus 2 months: " + cal.getTime());

        // Set a specific date
        cal.set(2025, Calendar.JANUARY, 1);
        System.out.println("Set to Jan 1 2025 : " + cal.getTime());
    }
}