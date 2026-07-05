public class TypeConversion {
    public static void main(String[] args) {

        // Float to Integer
        Float floatVal = 9.99f;
        Integer intVal = floatVal.intValue();
        System.out.println("Float to Int    : " + floatVal + " -> " + intVal);

        // Float to Double
        Double doubleVal = floatVal.doubleValue();
        System.out.println("Float to Double : " + floatVal + " -> " + doubleVal);

        // Double to Integer
        Double d = 45.67;
        Integer fromDouble = d.intValue();
        System.out.println("Double to Int   : " + d + " -> " + fromDouble);

        // Integer to Float
        Integer i = 25;
        Float fromInt = i.floatValue();
        System.out.println("Int to Float    : " + i + " -> " + fromInt);

        // Integer to Double
        Double fromIntDouble = i.doubleValue();
        System.out.println("Int to Double   : " + i + " -> " + fromIntDouble);
    }
}