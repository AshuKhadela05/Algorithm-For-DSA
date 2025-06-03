import java.util.Arrays;  // Importing Arrays class for easy array printing

public class SelectionSort {
    public static void main(String[] args) {
        // Declare and initialize the array to be sorted
        int[] numbers = {64, 34, 25, 12, 22, 11, 70};

        // Print the original unsorted array
        System.out.print("Original List: ");
        System.out.println(Arrays.toString(numbers));

        // Call the selection sort function to sort the array
        selectionSort(numbers);

        // Print the sorted array
        System.out.print("Sorted List: ");
        System.out.println(Arrays.toString(numbers));
    }

    // Method to perform selection sort on an integer array
    static void selectionSort(int[] arr) {
        int n = arr.length;

        // Outer loop to move the boundary of the unsorted part of the array
        for (int i = 0; i < n; i++) {
            int min_value = arr[i]; // Assume the current element is the minimum
            int position = i;       // Store the index of the minimum element

            // Inner loop to find the actual minimum element in the remaining array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < min_value) {
                    min_value = arr[j]; // Update minimum value
                    position = j;       // Update index of the minimum value
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            arr[position] = arr[i];
            arr[i] = min_value;
        }
    }
}

// OUTPUT:
// Original List: [64, 34, 25, 12, 22, 11, 70]
// Sorted List: [11, 12, 22, 25, 34, 64, 70]
