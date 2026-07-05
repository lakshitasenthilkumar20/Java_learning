import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListDemo {
    public static void main(String[] args) {

        // List is an interface - implemented by ArrayList and LinkedList

        // ArrayList - fast for random access
        List<String> arrayList = new ArrayList<>();
        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");
        arrayList.add("Two"); // duplicates allowed
        System.out.println("ArrayList          : " + arrayList);
        System.out.println("Get index 1        : " + arrayList.get(1));
        System.out.println("Index of 'Two'     : " + arrayList.indexOf("Two"));

        // LinkedList - fast for insertion/deletion
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Alpha");
        linkedList.add("Beta");
        linkedList.add("Gamma");
        System.out.println("\nLinkedList         : " + linkedList);

        // Common List operations
        System.out.println("\n--- Common List Operations ---");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(50);
        numbers.add(40);
        System.out.println("Original List      : " + numbers);
        System.out.println("Size               : " + numbers.size());
        System.out.println("Contains 30        : " + numbers.contains(30));

        numbers.remove(Integer.valueOf(20));
        System.out.println("After remove 20    : " + numbers);

        // SubList
        List<Integer> sub = numbers.subList(1, 3);
        System.out.println("SubList(1,3)       : " + sub);
    }
}