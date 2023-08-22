public class Sorting_Method_3 {

    public static void sorting(int arr[][]) {
        int rows = arr.length;
        int cols = arr[0].length;

        int total_elements = rows * cols;

        for (int k = 0; k < total_elements - 1; k++) {
            int i = k / cols;
            int j = k % cols;
            int nextI = (k + 1) / cols;
            int nextJ = (k + 1) % cols;

            if (arr[i][j] > arr[nextI][nextJ]) {
                // Swap
                int temp = arr[i][j];
                arr[i][j] = arr[nextI][nextJ];
                arr[nextI][nextJ] = temp;

                // Start over from the beginning to ensure proper sorting
                k = -1; // It will be incremented to 0 in the next iteration.
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
        int[][] matrix = { { 14, 12, 26, 8 }, { 53, 13, 45, 36 }, { 62, 19, 75, 45 }, { 59, 37, 28, 51 } };

        // Printing unsorted array
        System.out.println("Unsorted Matrix : ");
        printArray(matrix);

        // Printing Sorted array
        System.out.println("Sorted Matrix : ");
        sorting(matrix); // Time complexity O(n)
        printArray(matrix);
    }
}
