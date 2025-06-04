import java.util.Arrays;  // Import Arrays class to use Arrays.toString for displaying the array

public class InsertionSort {
    public static void main(String[] args) {
        // Define and initialize the array to be sorted
        int[] numbers = {64, 25, 12, 22, 11};

        // Display the original unsorted array
        System.out.println("Original List: ");
        System.out.println(Arrays.toString(numbers));

        // Call the insertion sort function
        insertionSort(numbers);

        // Display the sorted array
        System.out.println("Sorted List: ");
        System.out.println(Arrays.toString(numbers));
    }

    // Method to perform insertion sort
    static void insertionSort(int[] arr) {
        // Loop through each element starting from the second one
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];       // Current element to be inserted at the right place
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];  // Shift element to the right
                j = j - 1;            // Move to the previous element
            }

            // Place the key in its correct sorted position
            arr[j + 1] = key;
        }
    }
}
