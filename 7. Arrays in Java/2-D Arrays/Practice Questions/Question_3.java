/* Question 3 : Write a program to Find Transpose of a Matrix. What is Transpose?
   Transpose of a matrix is the process of swapping the o to columns. 
   For a 2x3 matrix,
   Matrix
   a11 a12 a13
   a21 a22 a23
   Transposed Matrix
   a11 a21
   a12 a22
   a13 a23 
*/

public class Question_3 {

    public static int[][] solution(int arr[][]) {
        int transpose[][] = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                transpose[j][i] = arr[i][j];
            }
        }
        return transpose;
    }

    public static void printArray(int arr[][]) {
        int rows = arr.length;
        int columns = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matirx[][] = { { 12, 14, 31, 26 }, { 25, 61, 47, 21 } };

        // Matrix
        System.out.println("Original Matrix : ");
        printArray(matirx);

        // Transposed Matrix
        System.out.println("Transposed Matrix : ");
        printArray(solution(matirx));
    }
}
