import java.util.Hashtable;
import java.util.Enumeration;

public class HashtableDemo {
    public static void main(String[] args) {

        // Create Hashtable
        Hashtable<Integer, String> table = new Hashtable<>();

        // Add key-value pairs
        table.put(1, "Alice");
        table.put(2, "Bob");
        table.put(3, "Charlie");
        table.put(4, "Diana");
        System.out.println("Hashtable         : " + table);

        // Access by key
        System.out.println("Get key 2         : " + table.get(2));

        // Check key/value exists
        System.out.println("Contains key 3    : " + table.containsKey(3));
        System.out.println("Contains 'Alice'  : " + table.containsValue("Alice"));

        // Remove
        table.remove(4);
        System.out.println("After remove key 4: " + table);

        // Size
        System.out.println("Size              : " + table.size());

        // Iterate using Enumeration
        System.out.println("\nIterating using Enumeration:");
        Enumeration<Integer> keys = table.keys();
        while (keys.hasMoreElements()) {
            int key = keys.nextElement();
            System.out.println("  Key: " + key + " -> Value: " + table.get(key));
        }

        // Note: Hashtable does NOT allow null keys or values
        // Note: Hashtable is synchronized (thread-safe)
    }
}