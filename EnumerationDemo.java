import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class EnumerationDemo {
    public static void main(String[] args) {

        // Enumeration with Vector (legacy class)
        Vector<String> vector = new Vector<>();
        vector.add("Red");
        vector.add("Green");
        vector.add("Blue");
        vector.add("Yellow");

        System.out.println("--- Enumeration with Vector ---");
        Enumeration<String> e1 = vector.elements();
        while (e1.hasMoreElements()) {
            System.out.println("  " + e1.nextElement());
        }

        // Enumeration with Hashtable keys
        System.out.println("\n--- Enumeration with Hashtable Keys ---");
        Hashtable<Integer, String> table = new Hashtable<>();
        table.put(1, "Alice");
        table.put(2, "Bob");
        table.put(3, "Charlie");

        Enumeration<Integer> keys = table.keys();
        while (keys.hasMoreElements()) {
            int key = keys.nextElement();
            System.out.println("  Key: " + key + " -> Value: " + table.get(key));
        }

        // Enumeration with Hashtable values
        System.out.println("\n--- Enumeration with Hashtable Values ---");
        Enumeration<String> values = table.elements();
        while (values.hasMoreElements()) {
            System.out.println("  Value: " + values.nextElement());
        }

        // Note: Enumeration is a legacy interface (older version of Iterator)
        // hasMoreElements() -> same as Iterator's hasNext()
        // nextElement()     -> same as Iterator's next()
        // Enumeration does NOT support remove() — use Iterator for that
    }
}