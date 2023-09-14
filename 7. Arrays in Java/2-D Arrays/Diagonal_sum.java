import java.util.Scanner;

public class Diagonal_sum {

    public static int diagonal_sum(int arr[][]) {
        // Calculating Primary Diagonal
        int primary_diag = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == j) {
                    primary_diag += arr[i][j];
                }
            }
        }

        // Calculating Primary Diagonal
        int secondary_diag = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (j == (arr.length - i - 1)) {
                    secondary_diag += arr[i][j];
                }
            }
        }

        // Calculating Daigonal sum
        int diag_sum = 0;
        if (arr.length % 2 == 0) {
            diag_sum = primary_diag + secondary_diag;
        } else {
            diag_sum = primary_diag + secondary_diag - arr[(arr.length - 1) / 2][(arr.length - 1) / 2];
        }

        return diag_sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of rows in Square Matrix : ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        // Input Elements
        System.out.print("Enter Elements of Matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Output Elements
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Calling Function - To calculate diagonals sum
        System.out.println("Diagonal sum = " + diagonal_sum(matrix));

        sc.close();

    }
}
