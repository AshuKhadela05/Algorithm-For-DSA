import java.util.Scanner;

// Node class representing each element in the list
class Node {
    int data;
    Node next;
    
    // Constructor to create a new node
    Node(int value) {
        data = value;
        next = null;
    }
}

public class LinkedListOperations {
    static Node head = null; // Head pointer for the linked list

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, value, position;

        while (true) {
            // Display menu
            System.out.println("\nMenu:");
            System.out.println("1. Insert at the beginning");
            System.out.println("2. Insert at the end");
            System.out.println("3. Insert at a specific position");
            System.out.println("4. Display the list");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            // Perform the selected operation
            switch (choice) {
                case 1:
                    System.out.print("Enter the value to insert at the beginning: ");
                    value = sc.nextInt();
                    insertAtBeginning(value);
                    break;

                case 2:
                    System.out.print("Enter the value to insert at the end: ");
                    value = sc.nextInt();
                    insertAtEnd(value);
                    break;

                case 3:
                    System.out.print("Enter the value to insert: ");
                    value = sc.nextInt();
                    System.out.print("Enter the position: ");
                    position = sc.nextInt();
                    insertAtPosition(value, position);
                    break;

                case 4:
                    displayList();
                    break;

                case 5:
                    System.out.println("Exiting program.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    
    // Insert node at the beginning of the list
    public static void insertAtBeginning(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode; // Update head to new node
    }
    
    // Insert node at the end of the list
    public static void insertAtEnd(int value) {
        Node newNode = new Node(value);

        // If list is empty, insert as head
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        // Traverse to the end of the list
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode; // Add new node at the end
    }
    
    // Insert node at a specific position (1-based index)
    public static void insertAtPosition(int value, int position) {
        Node newNode = new Node(value);

        // Insert at beginning if position is 1
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        int count = 1; 
        
        // Traverse to node before desired position
        while (temp != null && count < position - 1) {
            temp = temp.next;
            count = count + 1;
        }

        // If position is out of range
        if (temp == null) {
            System.out.println("Position is out of range.");
            return;
        }

        // Insert new node at the position
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Display all nodes in the linked list
    public static void displayList() {
        Node temp = head;

        if (temp == null) {
            System.out.println("The list is empty.");
            return;
        }

        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }
}

// Menu:
// 1. Insert at the beginning
// 2. Insert at the end
// 3. Insert at a specific position
// 4. Display the list
// 5. Exit
// Enter your choice: 1
// Enter the value to insert at the beginning: 5
//
// Menu:
// 1. Insert at the beginning
// 2. Insert at the end
// 3. Insert at a specific position
// 4. Display the list
// 5. Exit
// Enter your choice: 2
// Enter the value to insert at the end: 20
//
// Menu:
// 1. Insert at the beginning
// 2. Insert at the end
// 3. Insert at a specific position
// 4. Display the list
// 5. Exit
// Enter your choice: 3
// Enter the value to insert: 10
// Enter the position: 3
//
// Menu:
// 1. Insert at the beginning
// 2. Insert at the end
// 3. Insert at a specific position
// 4. Display the list
// 5. Exit
// Enter your choice: 3
// Enter the value to insert: 15
// Enter the position: 2
//
// Menu:
// 1. Insert at the beginning
// 2. Insert at the end
// 3. Insert at a specific position
// 4. Display the list
// 5. Exit
// Enter your choice: 4
// Linked List: 5 -> 15 -> 20 -> 10 -> NULL
//
// Menu:
// 1. Insert at the beginning
// 2. Insert at the end
// 3. Insert at a specific position
// 4. Display the list
// 5. Exit
// Enter your choice: 5
// Exiting program.
































