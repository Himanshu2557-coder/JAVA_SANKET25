public class variables {
     public static void main(String[] args) {
        // Declare and initialize variables
        // Java is staticly typed language, so you must declare the type of variable before using it.
        // Variables can be of different types: int, double, char, String, etc.


        // case sensitivity in variable names
        // rules for variable names:
        // 1. Variable names must start with a letter, underscore (_), or dollar sign ($).
        // 2. Variable names can contain letters, digits, underscores, and dollar signs.
        // 3. Variable names are case-sensitive (e.g., age and Age are different variables).
        // 4. Variable names cannot be a reserved keyword (e.g., int, double, class, etc.).

        int age = 25; // Integer variable
        double height = 5.9; // Double variable
        char initial = 'A'; // Character variable
        String name = "Alice"; // String variable
        
        // Print the variables
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " feet");
        System.out.println("Initial: " + initial);
        
        // Modify a variable
        age += 1; // Increment age by 1
        System.out.println("Updated Age: " + age);

       
        
     }
    
}
