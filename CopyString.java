 public class CopyString {
    static String copyString(String original) {
        char[] copy = new char[original.toCharArray().length];
        int i = 0;
        for (char c : original.toCharArray()) {
            copy[i++] = c;
        }
        return new String(copy);
    }

    public static void main(String[] args) {
        String original = "JavaInternship";
        String copied = copyString(original);
        System.out.println("Original : " + original);
        System.out.println("Copied   : " + copied);
    }
}