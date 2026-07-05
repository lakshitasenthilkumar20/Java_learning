import java.util.StringTokenizer;

public class StringTokenization {
    public static void main(String[] args) {

        String str = "Java,Python,C++,JavaScript";
        System.out.println("Original String: " + str);

        // Using StringTokenizer with comma delimiter
        StringTokenizer st = new StringTokenizer(str, ",");
        System.out.println("\nTokens using StringTokenizer:");
        while (st.hasMoreTokens()) {
            System.out.println("  Token: " + st.nextToken());
        }
        System.out.println("Total Tokens: " + new StringTokenizer(str, ",").countTokens());

        // Tokenizing with multiple delimiters
        String str2 = "one:two,three four";
        StringTokenizer st2 = new StringTokenizer(str2, ":, ");
        System.out.println("\nTokens with multiple delimiters (: , space):");
        while (st2.hasMoreTokens()) {
            System.out.println("  Token: " + st2.nextToken());
        }
    }
}