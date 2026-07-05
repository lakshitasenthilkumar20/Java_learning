import java.io.IOException;

public class ExceptionHandling {

    // throws keyword - declares checked exception
    static void readFile(String filename) throws IOException {
        if (filename == null) {
            throw new IOException("Filename cannot be null");
        }
        System.out.println("Reading file: " + filename);
    }

    // Custom Exception
    static class AgeException extends Exception {
        AgeException(String message) {
            super(message);
        }
    }

    static void validateAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be 18 or above. Given: " + age);
        }
        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) {

        // 1. try-catch
        System.out.println("--- 1. try-catch ---");
        try {
            int result = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        // 2. Multiple catch blocks
        System.out.println("\n--- 2. Multiple catch ---");
        try {
            int[] arr = new int[3];
            arr[5] = 10; // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Error: " + e.getMessage());
        }

        // 3. finally block
        System.out.println("\n--- 3. finally ---");
        try {
            String s = null;
            s.length(); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Null Error: " + e.getMessage());
        } finally {
            System.out.println("Finally block always executes.");
        }

        // 4. throw keyword
        System.out.println("\n--- 4. throw ---");
        try {
            throw new IllegalArgumentException("Invalid argument passed!");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught throw: " + e.getMessage());
        }

        // 5. throws keyword
        System.out.println("\n--- 5. throws ---");
        try {
            readFile(null);
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }

        // 6. Custom Exception
        System.out.println("\n--- 6. Custom Exception ---");
        try {
            validateAge(15);
        } catch (AgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }

        try {
            validateAge(21);
        } catch (AgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
    }
}