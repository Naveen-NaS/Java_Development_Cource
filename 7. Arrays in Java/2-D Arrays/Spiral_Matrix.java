public class Spiral_Matrix {

    public static void spiral_Matrix(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;

        int start_row = 0;
        int end_row = n - 1;
        int start_col = 0;
        int end_col = m - 1;

        while (start_row <= end_row && start_col <= end_col) {
            // printing top elements
            for (int j = start_col; j <= end_col; j++) {
                System.out.print(arr[start_row][j] + " ");
            }

            // printing right elements
            for (int i = start_row + 1; i <= end_row; i++) {
                System.out.print(arr[i][end_col] + " ");
            }

            // printing bottom elements
            for (int j = end_col - 1; j >= start_col; j--) {
                System.out.print(arr[end_row][j] + " ");
            }

            // printing left elements
            for (int i = end_row - 1; i >= start_row + 1; i--) {
                System.out.print(arr[i][start_col] + " ");
            }

            start_col++;
            start_row++;
            end_col--;
            end_row--;
        }
    }

    public static void main(String[] args) {

        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        // Output Elements
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Spiral Matrix Elements : ");
        spiral_Matrix(matrix);
    }
}
