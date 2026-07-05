public class StaticMethods {

    // Static method - belongs to class, not to any object
    static int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        // Static methods are called using class name — no object needed
        System.out.println("Sum      : " + StaticMethods.add(10, 20));
        System.out.println("Product  : " + StaticMethods.multiply(5, 4));
        StaticMethods.greet("Lakshita");
    }
}