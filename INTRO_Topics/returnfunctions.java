public class returnfunctions {

    // Return Functions in Java
    public static void main(String[] args) {
        System.out.println("Let's explore return functions in Java");
        
        int result = addTwoNumbers(10, 20);
        System.out.println("The sum of the numbers is: " + result);
        
        String message = greetCustomer("Alice");
        System.out.println(message);
    }
    // Function to add two numbers and return the result
    public static int addTwoNumbers(int a, int b) {
        return a + b; // Returns the sum of a and b
    }
    // Function to greet a customer and return a greeting message
    public static String greetCustomer(String name) {
        return "Hello, " + name + "! Welcome to our store."; // Returns a greeting message
    }
}
