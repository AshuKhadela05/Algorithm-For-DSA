import java.util.Scanner;

public class QueueOperations {

    // Define the size of the queue
    static final int SIZE = 100;
    // Create an array to store queue elements
    static int[] queue = new int[SIZE];
    // Initialize front and rear pointers
    static int front = -1;
    static int rear = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Infinite loop to display menu and perform operations
        while (true) {
            // Display options
            System.out.println("1. Enqueue Operation");
            System.out.println("2. Dequeue Operation");
            System.out.println("3. Display the queue");
            System.out.println("4. Exit");
            System.out.println("Enter your choice of operations: ");
            choice = scanner.nextInt();  // Read user choice

            // Perform operation based on user choice
            switch (choice) {
                case 1:
                    enqueue(scanner);  // Call enqueue function
                    break;
                case 2:
                    dequeue();    // Call dequeue function
                    break;
                case 3:
                    show();    // Call display function
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();     // Close Scanner
                    System.exit(0);   // Exit the program
                default:
                    System.out.println("Incorrect choice");
            }
        }
    }

    // Function to insert element into the queue
    public static void enqueue(Scanner scanner) {
        // Check if queue is full
        if (rear == SIZE - 1) {
            System.out.println("OverFlow");  // No more elements can be inserted
        } else {
            // If queue is empty, initialize front
            if (front == -1) {
                front = 0;
            }

            // Read element to insert
            System.out.println("Element to be inserted in the Queue: ");
            int item = scanner.nextInt();

            // Increase rear and insert the item
            rear = rear + 1;
            queue[rear] = item;
        }
    }

    // Function to delete element from the queue
    public static void dequeue() {
        // Check if queue is empty
        if (front == -1 || front > rear) {
            System.out.println("UnderFlow");  // No elements to remove
        } else {
            // Print the element being removed
            System.out.println("Element deleted from the Queue: " + queue[front]);

            // Move front ahead
            front = front + 1;

            // If queue becomes empty, reset both pointers
            if (front > rear) {
                front = -1;
                rear = -1;
            }
        }
    }

    // Function to display elements in the queue
    public static void show() {
        // Check if queue is empty
        if (front == -1) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("Queue: ");
            // Print all elements from front to rear
            for (int i = front; i <= rear; i++) {
                System.out.println(queue[i] + " ");
            }
            System.out.println();   // Move to next line
        }
    }
}

// OUTPUT:
// 1. Enqueue Operation
// 2. Dequeue Operation
// 3. Display the queue
// 4. Exit
// Enter your choice of operations: 
// 1
// Element to be inserted in the Queue: 
// 10
// 1. Enqueue Operation
// 2. Dequeue Operation
// 3. Display the queue
// 4. Exit
// Enter your choice of operations: 
// 1
// Element to be inserted in the Queue: 
// 20
// 1. Enqueue Operation
// 2. Dequeue Operation
// 3. Display the queue
// 4. Exit
// Enter your choice of operations: 
// 1
// Element to be inserted in the Queue: 
// 30
// 1. Enqueue Operation
// 2. Dequeue Operation
// 3. Display the queue
// 4. Exit
// Enter your choice of operations: 
// 3
// Queue: 
// 10 
// 20 
// 30 

// 1. Enqueue Operation
// 2. Dequeue Operation
// 3. Display the queue
// 4. Exit
// Enter your choice of operations: 
// 2
// Element deleted from the Queue: 10
// 1. Enqueue Operation
// 2. Dequeue Operation
// 3. Display the queue
// 4. Exit
// Enter your choice of operations: 
// 3
// Queue: 
// 20 
// 30 

// 1. Enqueue Operation
// 2. Dequeue Operation
// 3. Display the queue
// 4. Exit
// Enter your choice of operations: 
// 4
// Exiting...
