public class iterativestatements {
    public static void main(String[] args) {
        // For loop example
        for (int i = 0; i < 5; i++) {
            System.out.println("For loop iteration: " + i);
        }

        // While loop example
        int j = 0;
        while (j < 5) {
            System.out.println("While loop iteration: " + j);
            j++;
        }

        // Do-while loop example
        int k = 0;
        do {
            System.out.println("Do-while loop iteration: " + k);
            k++;
        } while (k < 5);

        // Enhanced for loop example
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println("Enhanced for loop number: " + number);
        }
        // Nested loop example
        for (int m = 0; m < 3; m++) {
            for (int n = 0; n < 2; n++) {
                System.out.println("Nested loop iteration: m = " + m + ", n = " + n);
            }
        }
        // Break statement example
        for (int p = 0; p < 5; p++) {
            if (p == 3) {
                System.out.println("Breaking at p = " + p);
                break; // Exit the loop when p equals 3
            }
            System.out.println("Looping: " + p);
        }
        // Continue statement example
        for (int q = 0; q < 5; q++) {
            if (q == 2) {
                System.out.println("Continuing at q = " + q);
                continue; // Skip the rest of the loop when q equals 2
            }
            System.out.println("Looping: " + q);
        }
        // Labeled break example
        outerLoop: for (int r = 0; r < 3; r++) {
            for (int s = 0; s < 3; s++) {
                if (s == 1) {
                    System.out.println("Breaking out of outer loop at r = " + r + ", s = " + s);
                    break outerLoop; // Exit the outer loop when s equals 1
                }
                System.out.println("Looping: r = " + r + ", s = " + s);
            }
        }
        // Labeled continue example
        outerContinue: for (int t = 0; t < 3; t++) {
            for (int u = 0; u < 3; u++) {
                if (u == 1) {
                    System.out.println("Continuing to next iteration of outer loop at t = " + t + ", u = " + u);
                    continue outerContinue; // Skip to the next iteration of the outer loop when u equals 1
                }
                System.out.println("Looping: t = " + t + ", u = " + u);
            }
        }
        // Infinite loop example (commented out to avoid running indefinitely)
        // while (true) {
        //     System.out.println("This is an infinite loop. Press Ctrl+C to stop.");
        // }
        // Note: Infinite loops should be used with caution and typically require a break condition.
        // Example of using a break statement to exit an infinite loop
        int x = 0;
        while (true) {
            System.out.println("Infinite loop iteration: " + x);
            if (x == 5) {
                System.out.println("Breaking out of infinite loop at x = " + x);
                break; // Exit the infinite loop when x equals 5
            }
            x++;
        }
        
    }
}
