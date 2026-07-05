public class EliminateSubstring {
    public static void main(String[] args) {

        String str = "Java is a great language. Java is fun.";
        String toRemove = "Java";

        System.out.println("Original String  : " + str);
        System.out.println("Substring to Remove: " + toRemove);

        // Method 1: Remove all occurrences using replace
        String result1 = str.replace(toRemove, "").trim();
        System.out.println("\nAfter Removing (replace) : " + result1);

        // Method 2: Remove using replaceAll (regex)
        String result2 = str.replaceAll(toRemove, "").trim();
        System.out.println("After Removing (replaceAll): " + result2);

        // Method 3: Remove first occurrence only
        String result3 = str.replaceFirst(toRemove, "").trim();
        System.out.println("Remove First Only        : " + result3);
    }
}