import java.util.Arrays;

public class SelectionSort{

    // Method to perform selection sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // One by one, move the boundary of the unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Assume the current position holds the minimum element
            int minIdx = i;

            // Iterate through the unsorted portion to find the actual minimum
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j; // Update the index of the minimum element
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    // Main method to test the algorithm
    public static void main(String[] args) {
        int[] data = {64, 25, 12, 22, 11};
        
        System.out.println("Original Array: " + Arrays.toString(data));
        
        selectionSort(data);
        
        System.out.println("Sorted Array:   " + Arrays.toString(data));
    }
}
