public class ToStringOverride {

    static class Student {
        String name;
        int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{name='" + name + "', age=" + age + "}";
        }
    }

    public static void main(String[] args) {
        Student s = new Student("Lakshita", 21);
        System.out.println(s); // calls overridden toString()
        System.out.println("Parent class of Student: " + s.getClass().getSuperclass().getName());
        // Every class in Java implicitly extends Object class
    }
}