import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {5, 3, 10, 23, 50, 43};

        // Call mergeSort to sort the array
        arr = mergeSort(arr);

        // Print the sorted array
        System.out.println("Sorted Array using MergeSort: " + Arrays.toString(arr));
    }

    // Recursively divides and sorts the array
    static int[] mergeSort(int[] arr) {
        // Base case: a single-element array is already sorted
        if (arr.length == 1) {
            return arr;
        }

        // Find the middle index to divide the array
        int mid = arr.length / 2;

        // Recursively sort the left and right halves
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        // Merge the sorted halves
        return merge(left, right);
    }

    // Merges two sorted arrays into a single sorted array
    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0; // pointer for first array
        int j = 0; // pointer for second array
        int k = 0; // pointer for mix array
        
        // Compare elements from both arrays and merge
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from the first array
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        // Copy any remaining elements from the second array
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }
}

// OUTPUT: 
// Sorted Array using MergeSort: [3, 5, 10, 23, 43, 50]




