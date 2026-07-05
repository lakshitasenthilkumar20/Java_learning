public class StringComparison {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        // == compares memory address (reference)
        System.out.println("--- == Operator (compares reference) ---");
        System.out.println("s1 == s2 : " + (s1 == s2));   // true  (same pool reference)
        System.out.println("s1 == s3 : " + (s1 == s3));   // false (different object)

        // equals() compares actual content
        System.out.println("\n--- equals() Method (compares content) ---");
        System.out.println("s1.equals(s2) : " + s1.equals(s2));  // true
        System.out.println("s1.equals(s3) : " + s1.equals(s3));  // true

        // equalsIgnoreCase() - compares content ignoring case
        System.out.println("\n--- equalsIgnoreCase() ---");
        String s4 = "hello";
        System.out.println("s1.equalsIgnoreCase(s4) : " + s1.equalsIgnoreCase(s4)); // true
    }
}