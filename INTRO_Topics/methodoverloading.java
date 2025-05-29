 // in java two or more methods can have the same name if they have different parameters
        // this is called o overloading
        // void func(){...}
        // void func(int a){...}
        // flaot func(int a, int b){...}

        // o overloading is not assoicated with return type
        /* void function(int a ) and int function (int a) */ 
        // overloaded methods may have same or different return types , but they must have different parameter lists

public class methodoverloading {

    public static String formatnumber(int value) {
        return String.format("%,d", value); // Adds comma as thousands separator
    }

    public static String formatnumber(double value) {
        return String.format("%,.3f", value); // Comma and 3 decimal places
    }

    public static String formatnumber(String value) {
        return String.format("%,.3f", Double.parseDouble(value)); // Parses string to double and formats
    }

    public static void main(String[] args) {
        methodoverloading obj = new methodoverloading();
        
        System.out.println(obj.formatnumber(1000));        // Output: 1,000
        System.out.println(obj.formatnumber(1000.123));    // Output: 1,000.123
        System.out.println(obj.formatnumber("1000.123"));  // Output: 1,000.123
    }
}
