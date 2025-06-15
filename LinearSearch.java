public class LinearSearch {

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;  // Return index if element is found
            }
        }
        return -1;  // Return -1 if not found
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;

        int result = linearSearch(numbers, target);

        if (result == -1) {
            System.out.println("Element not found in the array. ");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
