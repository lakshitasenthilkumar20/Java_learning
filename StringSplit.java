import java.util.Arrays;

public class StringSplit {
    public static void main(String[] args) {

        // Split with comma delimiter
        String csv = "Apple,Banana,Mango,Cherry";
        String[] fruits = csv.split(",");
        System.out.println("Original String : " + csv);
        System.out.println("Split by ','    : " + Arrays.toString(fruits));

        // Split with space delimiter
        String sentence = "Java is fun to learn";
        String[] words = sentence.split(" ");
        System.out.println("\nOriginal String : " + sentence);
        System.out.println("Split by space  : " + Arrays.toString(words));

        // Split with limit (split into max 2 parts)
        String data = "name:age:city";
        String[] parts = data.split(":", 2);
        System.out.println("\nOriginal String : " + data);
        System.out.println("Split with limit: " + Arrays.toString(parts));
    }
}