import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {

        Random random = new Random();

        // Random integer
        System.out.println("Random int        : " + random.nextInt());

        // Random int within range (0 to 99)
        System.out.println("Random 0-99       : " + random.nextInt(100));

        // Random double (0.0 to 1.0)
        System.out.println("Random double     : " + random.nextDouble());

        // Random float
        System.out.println("Random float      : " + random.nextFloat());

        // Random boolean
        System.out.println("Random boolean    : " + random.nextBoolean());

        // Random long
        System.out.println("Random long       : " + random.nextLong());

        // Generate 5 random numbers between 1 and 50
        System.out.println("\n5 Random Numbers (1-50):");
        for (int i = 0; i < 5; i++) {
            System.out.println("  " + (random.nextInt(50) + 1));
        }
    }
}