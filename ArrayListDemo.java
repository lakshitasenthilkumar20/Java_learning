import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Cherry");
        list.add("Apple"); // duplicates allowed
        System.out.println("ArrayList         : " + list);

        // Access by index
        System.out.println("Element at index 1: " + list.get(1));

        // Update element
        list.set(2, "Grapes");
        System.out.println("After set(2)      : " + list);

        // Remove element
        list.remove("Banana");
        System.out.println("After remove      : " + list);

        // Size
        System.out.println("Size              : " + list.size());

        // Check if contains
        System.out.println("Contains 'Apple'  : " + list.contains("Apple"));

        // Iterate
        System.out.println("\nIterating ArrayList:");
        for (String item : list) {
            System.out.println("  " + item);
        }

        // Clear
        list.clear();
        System.out.println("\nAfter clear, isEmpty: " + list.isEmpty());
    }
}