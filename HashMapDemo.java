import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        // Create HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Add key-value pairs
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");
        map.put(4, "JavaScript");
        map.put(null, "NullKey"); // HashMap allows null key
        System.out.println("HashMap           : " + map);

        // Access by key
        System.out.println("Get key 2         : " + map.get(2));

        // Update existing key
        map.put(3, "Kotlin");
        System.out.println("After update key 3: " + map);

        // Check key/value
        System.out.println("ContainsKey 1     : " + map.containsKey(1));
        System.out.println("ContainsValue Java: " + map.containsValue("Java"));

        // Remove
        map.remove(4);
        System.out.println("After remove key 4: " + map);

        // Size
        System.out.println("Size              : " + map.size());

        // Iterate using entrySet
        System.out.println("\nIterating HashMap:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("  Key: " + entry.getKey() + " -> Value: " + entry.getValue());
        }

        // Note: HashMap is NOT synchronized (not thread-safe)
        // Note: HashMap allows one null key and multiple null values
    }
}