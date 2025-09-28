import java.util.Scanner;

public class FactorialRecursive {

    // Direct Call
//    public static void main(String[] args) {
//        int num = 5;  // You can change this value to test other numbers
//
//        // Calling the recursive factorial method and printing result
//        System.out.println("Factorial of " + num + " is: " + factorial(num));
//    }

    // User Input
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Enter a number to calculate its factorial: ");
        int num = scanner.nextInt();

        // Handle negative input
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int result = factorial(num);
            System.out.println("Factorial of " + num + " is: " + result);
        }
        scanner.close();
    }
    
    // Recursive method to calculate factorial
    public static int factorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1)
            return 1;
        else
            // Recursive case: n! = n * (n-1)!
            return n * factorial(n - 1);
    }
}

// OUTPUT:
// Enter a number to calculate its factorial:
// 5
// Factorial of 5 is: 120


