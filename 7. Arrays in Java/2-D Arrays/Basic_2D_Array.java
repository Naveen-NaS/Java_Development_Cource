import java.util.*;

public class Basic_2D_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];
        int rows = matrix.length;
        int columns = matrix[0].length;
        System.out.print("Enter Elements of Matrix : ");

        // Input
        for(int i=0; i < rows; i++) {
            for(int j=0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Output
        for(int i=0; i < rows; i++) {
            for(int j=0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }

        sc.close();
    }
}
