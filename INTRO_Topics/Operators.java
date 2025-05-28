public class Operators {

    // Arithmetic Operators: +, -, *, /, %
    // Relational Operators: ==, !=, >, <, >=, <=
    // Logical Operators: &&, ||, !
    // Bitwise Operators: &, |, ^, <<, >>
    // Assignment Operators: =, +=, -=, *=, /=, %=
    // Unary Operators: +, -, ++, --
    
}

    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b)); // 15
        System.out.println("Subtraction: " + (a - b)); // 5
        System.out.println("Multiplication: " + (a * b)); // 50
        System.out.println("Division: " + (a / b)); // 2
        System.out.println("Modulus: " + (a % b)); // 0

        // Relational Operators
        System.out.println("Equal to: " + (a == b)); // false
        System.out.println("Not equal to: " + (a != b)); // true
        System.out.println("Greater than: " + (a > b)); // true
        System.out.println("Less than: " + (a < b)); // false
        System.out.println("Greater than or equal to: " + (a >= b)); // true
        System.out.println("Less than or equal to: " + (a <= b)); // false

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("Logical AND: " + (x && y)); // false
        System.out.println("Logical OR: " + (x || y)); // true
        System.out.println("Logical NOT: " + (!x)); // false

        // Bitwise Operators
        int m = 5, n = 3; // m = 0101, n = 0011 in binary
        System.out.println("Bitwise AND: " + (m & n)); // 1 (0001)
        System.out.println("Bitwise OR: " + (m | n)); // 7 (0111)
        System.out.println("Bitwise XOR: " + (m ^ n)); // 6 (0110)
        System.out.println("Left Shift: " + (m << 1)); // 10 (1010)
        System.out.println("Right Shift: " + (m >> 1)); // 2 (0010)

        // Assignment Operators
        int p = 10;
        p += 5; // p = p + 5
        System.out.println("After += : " + p); // 15

        p -= 3; // p = p - 3
        System.out.println("After -= : " + p); // 12
        p *= 2; // p = p * 2
        System.out.println("After *= : " + p); // 24
}