public class alltypesextra {
    public static void main(String[] args) {
        int num = 29; // Example number to check for primality
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false; // Found a divisor, not prime
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    // reverse of a number
    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Append it to the reversed number
            number /= 10; // Remove the last digit from the original number
        }
        return reversed;
    }

    // sum of digits of a number
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10; // Add the last digit to the sum
            number /= 10; // Remove the last digit
        }
        return sum;
    }

    // factorial of a number
    public static int factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i; // Multiply the result by the current number
        }
        return result;
    }

    // Fibonacci series up to n terms
    public static void fibonacciSeries(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci series up to " + n + " terms: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b; // Calculate the next term
            a = b; // Update a to the next term
            b = next; // Update b to the next term
        }
        System.out.println();
    }

    // Check if a number is Armstrong
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length(); // Count the number of digits

        while (number != 0) {
            int digit = number % 10; // Get the last digit
            sum += Math.pow(digit, digits); // Raise it to the power of the number of digits and add to sum
            number /= 10; // Remove the last digit
        }

        return sum == originalNumber; // Check if the sum equals the original number
    }

    // Check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Append it to the reversed number
            number /= 10; // Remove the last digit
        }

        return reversed == originalNumber; // Check if the reversed number equals the original
    }

    // Check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false; // Perfect numbers are positive integers
        }
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i; // Add the divisor to the sum
            }
        }
        return sum == number; // Check if the sum of divisors equals the original number
    }

    // sum of numbers from 1 to n
    public static int sumOfNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; // Add each number from 1 to n
        }
        return sum; // Return the total sum
    }

    
}
