public class EliminateNumericValues {
    public static void main(String[] args) {

        String str = "Hello123 World456 Java789";
        System.out.println("Original String : " + str);

        // Method 1: Using replaceAll with regex
        String result1 = str.replaceAll("[0-9]", "");
        System.out.println("After Removing Digits (replaceAll): " + result1);

        // Method 2: Manual character-by-character check
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                sb.append(c);
            }
        }
        System.out.println("After Removing Digits (manual)    : " + sb.toString());
    }
}