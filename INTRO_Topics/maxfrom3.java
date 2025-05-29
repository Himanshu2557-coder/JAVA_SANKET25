public class maxfrom3{
    public static void main(String[] args) {
        int a = 10, b = 20, c = 15;
        int max;

        // Find the maximum of three numbers
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }

        System.out.println("The maximum number is: " + max);
    }
}
