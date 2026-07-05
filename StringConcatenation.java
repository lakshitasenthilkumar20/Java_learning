public class StringConcatenation {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "World";

        // Method 1: Using + operator
        String result1 = s1 + " " + s2;
        System.out.println("Using + operator  : " + result1);

        // Method 2: Using concat() method
        String result2 = s1.concat(" ").concat(s2);
        System.out.println("Using concat()    : " + result2);

        // Method 3: Using StringBuffer
        StringBuffer sb = new StringBuffer();
        sb.append(s1).append(" ").append(s2);
        System.out.println("Using StringBuffer: " + sb);

        // Method 4: Using StringBuilder
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(s1).append(" ").append(s2);
        System.out.println("Using StringBuilder: " + sBuilder);
    }
}