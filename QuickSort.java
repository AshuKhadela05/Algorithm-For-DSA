import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {20, 10, 5, 35, 3, 70, 54};

        // Calling custom QuickSort method
        quickSort(arr, 0, arr.length - 1);

        // Printing the sorted array
        System.out.println("Sorted Array using QuickSort: " + Arrays.toString(arr));

        // Uncomment below to use Java's built-in sort
        // Arrays.sort(arr);
        // System.out.println("Sorted Array using Arrays.sort: " + Arrays.toString(arr));
    }

    /**
     * Recursive QuickSort function.
     * It partitions the array and recursively sorts each half.
     */
    static void quickSort(int[] arr, int low, int high) {
        // Base case: If the portion has 1 or no elements, return
        if (low >= high) {
            return;
        }

        // Partition the array and get the pivot index
        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];  // Choosing middle element as pivot

        // Partitioning process
        while (start <= end) {
            // Move the start pointer to the right as long as elements are less than pivot
            while (arr[start] < pivot) {
                start++;
            }
            // Move the end pointer to the left as long as elements are greater than pivot
            while (arr[end] > pivot) {
                end--;
            }

            // Swap elements if start <= end
            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        // Recursively sort the two halves
        quickSort(arr, low, end);
        quickSort(arr, start, high);
    }
}

// OUTPUT :
// Sorted Array using QuickSort: [3, 5, 10, 20, 35, 54, 70]
