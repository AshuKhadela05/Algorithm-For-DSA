import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number n to find nth Fibonacci number: ");
        int n = sc.nextInt();

        // Create object and call fib function
        Solution13 sol = new Solution13();
        int result = sol.fib(n);

        // Output the result
        System.out.println("Fibonacci number at position " + n + " is: " + result);

        sc.close();
    }
}

// Solution class containing Fibonacci logic
class Solution13 {
    public int fib(int n) {
        // Base case: F(0) = 0
        if (n == 0) return 0;

        // Base case: F(1) = 1
        if (n == 1) return 1;

        int firstNum = 0;   // Represents F(n-2)
        int secondNum = 1;  // Represents F(n-1)
        int nextNum = 0;    // Will store F(n)

        // Loop to calculate Fibonacci iteratively
        for (int i = 2; i <= n; i++) {
            nextNum = firstNum + secondNum; // F(n) = F(n-1) + F(n-2)
            firstNum = secondNum;           // Move forward
            secondNum = nextNum;
        }

        return nextNum;  // Return the nth Fibonacci number
    }
}
