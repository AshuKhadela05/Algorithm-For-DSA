public class HeapSort {
    
    // Main method to sort an array using Heap Sort
    public void heapsort(int[] arr) {
        int n = arr.length;

        // Step 1: Build a max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Step 2: Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
           
            // Heapify the reduced heap
            heapify(arr, i, 0);
        }
    }
    
    // Method to heapify a subtree rooted at index i
    void heapify(int[] arr, int n, int i) {

        int largest = i;  // root
        int left = 2 * i + 1;  // left child
        int right = 2 * i + 2;  // right child

        
        // Check if left child is larger
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // Check if right child is larger
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If root is not the largest
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected subtree
            heapify(arr, n, largest);
        }
    }    

    // Method to print the array using traditional loop
    void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    // Main Method
    public static void main(String[] args) {

        HeapSort sorter = new HeapSort();
        int[] arr = {12, 11, 13, 5, 6, 7};

        System.out.println("Original Array : ");
        sorter.printArray(arr);

        sorter.heapsort(arr);

        System.out.println("Sorted Array : ");
        sorter.printArray(arr);
    }
}

// OUTPUT:
// Original Array :
// 12 11 13 5 6 7 
// Sorted Array : 
// 5 6 7 11 12 13










