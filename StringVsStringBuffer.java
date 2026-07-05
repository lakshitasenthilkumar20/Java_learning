public class StringVsStringBuffer {
    public static void main(String[] args) {

        // String - Immutable (cannot be changed once created)
        String str = "Hello";
        str = str + " World"; // creates a NEW string object
        System.out.println("String Result: " + str);

        // StringBuffer - Mutable (can be changed)
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World"); // modifies the SAME object
        System.out.println("StringBuffer Result: " + sb);

        // String is not thread-safe, StringBuffer is thread-safe
        // StringBuffer is slower than String for simple operations
        // but faster when doing multiple modifications

        System.out.println("\n--- StringBuffer Methods ---");
        StringBuffer sb2 = new StringBuffer("Java");
        sb2.append(" Programming");
        System.out.println("After append  : " + sb2);
        sb2.insert(4, " is Fun");
        System.out.println("After insert  : " + sb2);
        sb2.delete(4, 11);
        System.out.println("After delete  : " + sb2);
        sb2.reverse();
        System.out.println("After reverse : " + sb2);
    }
}