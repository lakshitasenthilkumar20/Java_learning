public class PrivateProtectedClass {

    // Only inner/nested classes can be private or protected
    // Top-level classes CANNOT be private or protected

    private static class PrivateInnerClass {
        void display() {
            System.out.println("I am a private inner class.");
            System.out.println("Accessible only within PrivateProtectedClass.");
        }
    }

    protected static class ProtectedInnerClass {
        void display() {
            System.out.println("I am a protected inner class.");
            System.out.println("Accessible within the package and subclasses.");
        }
    }

    public static void main(String[] args) {
        new PrivateInnerClass().display();
        System.out.println();
        new ProtectedInnerClass().display();
    }
}