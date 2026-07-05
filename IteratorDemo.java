import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;

public class IteratorDemo {
    public static void main(String[] args) {

        // Iterator with ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");
        list.add("Kotlin");

        System.out.println("--- Iterating ArrayList using Iterator ---");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String item = it.next();
            System.out.println("  " + item);
        }

        // Remove elements safely using Iterator (avoids ConcurrentModificationException)
        System.out.println("\n--- Removing 'C++' using Iterator ---");
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            String item = it2.next();
            if (item.equals("C++")) {
                it2.remove(); // safe removal during iteration
            }
        }
        System.out.println("After removal: " + list);

        // Iterator with HashSet
        System.out.println("\n--- Iterating HashSet using Iterator ---");
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        Iterator<Integer> setIt = set.iterator();
        while (setIt.hasNext()) {
            System.out.println("  " + setIt.next());
        }

        // Note: hasNext() checks if next element exists
        // Note: next() returns the next element
        // Note: remove() safely removes current element during iteration
    }
}