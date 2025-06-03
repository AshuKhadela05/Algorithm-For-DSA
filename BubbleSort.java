import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // Main method to test the sorting
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        System.out.print("Original List: ");
        System.out.println(Arrays.toString(numbers));
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }

        bubbleSort(numbers);

        System.out.print("Sorted List: ");
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
        System.out.println(Arrays.toString(numbers));
    }

    // Method to perform bubble sort
    static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Traverse through all elements in the array
        for (int i = 0; i < n; i++) {
            // Last i elements are already in place
            for (int j = 0; j < n - i -1; j++) {
                // Swap if the current element is greater than the next
                if (arr[j] > arr[j + 1]) {
                    // Swapping
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

