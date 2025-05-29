public class typecasting {
    public static void main(String[] args) {
        // Type Casting in Java
        // Type casting is the process of converting a variable from one type to another.
        // There are two types of type casting in Java: implicit (widening) and explicit (narrowing).

        // Implicit type casting (widening)
        // This occurs when converting a smaller primitive type to a larger primitive type.
        // It is done automatically by the Java compiler without any data loss.
        // Example: int to long, long to float, float to double
        int intValue = 100;
        long longValue = intValue; // int to long
        float floatValue = longValue; // long to float
        double doubleValue = floatValue; // float to double

        System.out.println("Implicit Type Casting:");
        System.out.println("int to long: " + longValue);
        System.out.println("long to float: " + floatValue);
        System.out.println("float to double: " + doubleValue);

        // Explicit type casting (narrowing)
        // This occurs when converting a larger primitive type to a smaller primitive type.
        // It requires explicit conversion and may result in data loss.
        // Example: double to float, float to long, long to int
        
        double anotherDoubleValue = 123.45;
        float anotherFloatValue = (float) anotherDoubleValue; // double to float
        long anotherLongValue = (long) anotherFloatValue; // float to long
        int anotherIntValue = (int) anotherLongValue; // long to int

        System.out.println("\nExplicit Type Casting:");
        System.out.println("double to float: " + anotherFloatValue);
        System.out.println("float to long: " + anotherLongValue);
        System.out.println("long to int: " + anotherIntValue);
    }
}
