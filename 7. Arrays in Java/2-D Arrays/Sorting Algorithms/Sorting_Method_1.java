public class Sorting_Method_1 {

    public static void sorting(int arr[][]) {
        // Sorting by Row
        for (int i = 0; i < arr.length; i++) {
            for (int turns = 0; turns < arr.length - 1; turns++) {
                for (int j = 0; j < arr[0].length - 1; j++) {
                    if (arr[i][j] > arr[i][j + 1]) {
                        // Swap
                        int temp = arr[i][j];
                        arr[i][j] = arr[i][j + 1];
                        arr[i][j + 1] = temp;
                    }
                }
            }
        }

        // Sorting by Column
        for (int j = 0; j < arr[0].length; j++) {
            for (int turns = 0; turns < arr.length - 1; turns++) {
                for (int i = 0; i < arr.length - 1; i++) {
                    if (arr[i][j] > arr[i + 1][j]) {
                        // Swap
                        int temp = arr[i][j];
                        arr[i][j] = arr[i + 1][j];
                        arr[i + 1][j] = temp;
                    }
                }
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
        System.out.print("Unsorted Matrix : ");
        printArray(matrix);

        // Printing Sorted array
        System.out.println("Sorted Matrix : ");
        sorting(matrix); // Time complexity O(n pow 3)
        printArray(matrix);
    }
}
