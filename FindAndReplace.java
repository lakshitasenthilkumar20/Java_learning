public class FindAndReplace {
    public static void main(String[] args) {

        String str = "Java is a great language. Java is widely used.";
        System.out.println("Original String : " + str);

        // Replace first occurrence only
        String replaceFirst = str.replaceFirst("Java", "Python");
        System.out.println("Replace First   : " + replaceFirst);

        // Replace all occurrences
        String replaceAll = str.replace("Java", "Python");
        System.out.println("Replace All     : " + replaceAll);

        // Check if substring exists before replacing
        String target = "great";
        if (str.contains(target)) {
            String replaced = str.replace(target, "powerful");
            System.out.println("After Replace   : " + replaced);
        } else {
            System.out.println("Substring not found.");
        }
    }
}