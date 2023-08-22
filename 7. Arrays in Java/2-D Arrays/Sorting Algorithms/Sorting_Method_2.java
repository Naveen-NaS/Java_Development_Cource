public class Sorting_Method_2 {

    public static void sorting(int arr[][]) {
        // Converting 2-D array in flattend(single) Array
        int rows = arr.length;
        int cols = arr[0].length;

        int[] flattend_Array = new int[rows * cols];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                flattend_Array[index++] = arr[i][j];
            }
        }

        // Bubble Sort on the flattened array
        for (int turns = 0; turns < flattend_Array.length - 1; turns++) {
            for (int i = 0; i < flattend_Array.length - 1; i++) {
                if (flattend_Array[i] > flattend_Array[i + 1]) {
                    // Swap
                    int temp = flattend_Array[i];
                    flattend_Array[i] = flattend_Array[i + 1];
                    flattend_Array[i + 1] = temp;
                }
            }
        }

        // Update the sorted values back to the 2D array
        index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = flattend_Array[index++];
            }
        }

    }

    public static void printArray(int arr[][]) {
        int rows = arr.length;
        int columns = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 14, 12, 26, 8 }, { 53, 12, 45, 36 }, { 62, 19, 75, 45 }, { 59, 37, 28, 51 } };

        // Printing unsorted array
        System.out.println("Unsorted Matrix : ");
        printArray(matrix);

        // Printing Sorted array
        System.out.println("Sorted Matrix : ");
        sorting(matrix); // Time complexity O(n pow 2)
        printArray(matrix);
    }
}
