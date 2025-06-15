import com.sun.source.doctree.EscapeTree;

import java.util.Scanner;

public class StackOperations {

    static final int SIZE = 4;
    static int[] stack = new int[SIZE];
    static int top = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\nPerform operations on the stack:");
            System.out.println("1. Push the element");
            System.out.println("2. Pop the element");
            System.out.println("3. Show");
            System.out.println("4. End");
            System.out.println("Enter the choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    push(scanner);
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    show();
                    break;
                case  4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!!");
            }
        }
    }

    public static void push(Scanner scanner) {
        if (top == SIZE - 1) {
            System.out.println("OverFlow !!");
        } else {
            System.out.println("Enter the element to be added onto the stack: ");
            int x = scanner.nextInt();
            top = top + 1;
            stack[top] = x;
        }
    }

    public  static void pop() {
        if (top == -1) {
            System.out.println("UnderFlow !!");
        } else {
            System.out.println("Popped element: " + stack[top]);
            top = top - 1;
        }
    }

    public static  void show() {
        if (top == -1) {
            System.out.println("UnderFlow!!");
        } else {
            System.out.println("Elements present in the stack: ");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
}

// OUTPUT:
// Perform operations on the stack:
// 1. Push the element
// 2. Pop the element
// 3. Show
// 4. End
// Enter the choice: 
// 1
// Enter the element to be added onto the stack: 
// 10

//  Perform operations on the stack:
// 1. Push the element
// 2. Pop the element
// 3. Show
// 4. End
// Enter the choice: 
// 1
// Enter the element to be added onto the stack: 
// 20

//  Perform operations on the stack:
// 1. Push the element
// 2. Pop the element
// 3. Show
// 4. End
// Enter the choice: 
// 1
// Enter the element to be added onto the stack: 
// 30

//  Perform operations on the stack:
// 1. Push the element
// 2. Pop the element
// 3. Show
// 4. End
// Enter the choice: 
// 2
// Popped element: 30

//  Perform operations on the stack:
// 1. Push the element
// 2. Pop the element
// 3. Show
// 4. End
// Enter the choice: 
// 3
// Elements present in the stack: 
// 20
// 10

//  Perform operations on the stack:
// 1. Push the element
// 2. Pop the element
// 3. Show
// 4. End
// Enter the choice: 
// 1
// Enter the element to be added onto the stack: 
// 30

//  Perform operations on the stack:
// 1. Push the element
// 2. Pop the element
// 3. Show
// 4. End
// Enter the choice: 
// 3
// Elements present in the stack: 
// 30
// 20
// 10

//  Perform operations on the stack:
// 1. Push the element
// 2. Pop the element
// 3. Show
// 4. End
// Enter the choice: 
// 4
// Exiting...
