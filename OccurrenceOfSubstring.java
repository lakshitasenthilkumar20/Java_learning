public class OccurrenceOfSubstring {
    public static void main(String[] args) {

        String str = "Java is great. Java is popular. Java is powerful.";
        String target = "Java";

        System.out.println("Original String : " + str);
        System.out.println("Search Substring: " + target);

        // Count occurrences
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(target, index)) != -1) {
            count++;
            index += target.length();
        }
        System.out.println("Occurrence Count: " + count);

        // Print positions of each occurrence
        System.out.println("\nFound at positions:");
        int pos = 0;
        while ((pos = str.indexOf(target, pos)) != -1) {
            System.out.println("  Index: " + pos);
            pos += target.length();
        }
    }
}