public class functions{
    public static void main(String[] args) {
        System.out.println("lets get started with functions in java");
        greetingCustomers();
        greetingCustomers();
        greetingCustomers();
        greetingCustomers();
        greetingCustomers();
        System.out.println("see you soon");
        addtwonumbers(10, 20);
        
    }
   
    public static void greetingCustomers() {
        System.out.println("Hello, World!");
    }
    public static void addtwonumbers(int a , int b){

        int sum = a + b;
        System.out.println("the sum of number is " + sum);
    }
    // return type of function is the type of value that the function returns
    // if a function does not return any value, its return type is void
    // if a function returns a value, its return type is the type of the value it returns
    // for example, if a function returns an integer, its return type is int

    
    
}