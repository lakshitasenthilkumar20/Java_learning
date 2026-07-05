public class StringLength {
    static int stringLength(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Length of 'Internship' = " + stringLength("Internship"));
    }
}