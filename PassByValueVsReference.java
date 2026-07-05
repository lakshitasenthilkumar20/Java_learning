public class PassByValueVsReference {

    static void modifyPrimitive(int x) {
        x = 100;
    }

    static void modifyArray(int[] arr) {
        arr[0] = 999;
    }

    static void modifyString(String s) {
        s = "Changed";
    }

    static void modifyStringArray(String[] arr) {
        arr[0] = "Modified";
    }

    static class Person {
        String name;
        Person(String name) { this.name = name; }
    }

    static void modifyObject(Person p) {
        p.name = "Updated Name";
    }

    public static void main(String[] args) {
        // Primitive
        int num = 10;
        modifyPrimitive(num);
        System.out.println("Primitive after modify  : " + num + " (unchanged - pass by value)");

        // Array
        int[] arr = {1, 2, 3};
        modifyArray(arr);
        System.out.println("Array[0] after modify   : " + arr[0] + " (changed - reference passed)");

        // String
        String str = "Original";
        modifyString(str);
        System.out.println("String after modify     : " + str + " (unchanged - String is immutable)");

        // String Array
        String[] strArr = {"One", "Two"};
        modifyStringArray(strArr);
        System.out.println("StringArray[0] after    : " + strArr[0] + " (changed - reference passed)");

        // Custom Object
        Person person = new Person("Lakshita");
        modifyObject(person);
        System.out.println("Object name after       : " + person.name + " (changed - reference passed)");
    }
}