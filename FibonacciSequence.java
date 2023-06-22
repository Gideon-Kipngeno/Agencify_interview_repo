import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FibonacciSequence {
    // Map to store previously calculated Fibonacci numbers
    private static Map<Integer, Integer> fibCache = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        // Validate user input
        if (n <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            return;
        }

        System.out.println("Fibonacci sequence up to " + n + ":");
        // Generate and print the Fibonacci sequence
        for (int i = 0; i <= n; i++) {
            int fibonacciNumber = fibonacci(i);
            System.out.print(fibonacciNumber + " ");
        }
    }

    // Recursive method to calculate the Fibonacci number
    private static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            // Check if Fibonacci number is already calculated and stored in the cache
            if (fibCache.containsKey(n)) {
                return fibCache.get(n);
            }

            // Calculate the Fibonacci number and store it in the cache
            int fibNumber = fibonacci(n - 1) + fibonacci(n - 2);
            fibCache.put(n, fibNumber);
            return fibNumber;
        }
    }
}
