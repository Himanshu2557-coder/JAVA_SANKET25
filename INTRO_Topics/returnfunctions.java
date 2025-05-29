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

    // Note: The return type of a function is specified before the function name.
    // If a function does not return any value, its return type is void.
    // If a function returns a value, its return type is the type of the value it returns.
    // For example, if a function returns an integer, its return type is int.
    // If a function returns a string, its return type is String.
    // You can also return other types like double, boolean, etc.
    // You can also return objects, arrays, or any other data type as needed.
    // Functions can also return multiple values using arrays or objects, but typically one value is returned.
    // Functions can also be overloaded, meaning you can have multiple functions with the same name but different parameters.
    // This allows for more flexibility in how functions are called and used.
    // Functions can also be recursive, meaning they can call themselves to solve problems.
    // This is useful for problems that can be broken down into smaller subproblems.
    
    // Functions can also be used to encapsulate code, making it reusable and easier to maintain.

    



    

}
