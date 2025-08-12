

import java.util.Arrays;  // Import Arrays class for printing the array

public class BinarySearch {
    public static void main(String[] args) {
        // Pre-sorted array to perform binary search on
        int[] numbers = {11, 12, 22, 25, 64, 90};

        // Element to be searched
        int target = 11;
        
        // Display the sorted array
        System.out.println("Sorted List: ");
        System.out.println(Arrays.toString(numbers));

        // Perform binary search and store the result index
        int index = binarySearch(numbers, target);

        // Display the result based on search outcome
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the list");
        }
    }
    
    // Method to perform binary search on a sorted array
    static int binarySearch(int[] arr, int target) {
        int low = 0;                 // Starting index of the search range
        int high = arr.length - 1;   // Ending index of the search range


        // Continue searching while the range is valid
        while (low <= high) {
            int mid = (low + high) / 2;  // Find the middle index

            // If the middle element is the target, return its index
            if (arr[mid] == target) {
                return mid;
            }
            // If the target is greater, ignore the left half
            else if (arr[mid] < target) {
                low = mid + 1;
            }
            // If the target is smaller, ignore the right half
            else {
                high = mid - 1;
            }
        }

        // If element not found, return -1
        return -1;
    }
}

// OUTPUT:
// Sorted List:
// Element 11 found at index 0

