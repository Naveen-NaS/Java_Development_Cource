import java.util.Scanner;

public class Max_element { 

    public static int max_element(int arr[][]) {
        int max_element = Integer.MIN_VALUE;
        for(int i=1; i < arr.length; i++) {
            for(int j=1; j < arr[0].length; j++) {
                max_element = Math.max(arr[i][j], max_element);
            }
        }
        return max_element;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        // Input Elements 
        System.out.print("Enter Elemnts of Matrix : ");
        for(int i=0; i < matrix.length; i++) {
            for(int j=0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Output Elements
        for(int i=0; i < matrix.length; i++) {
            for(int j=0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Calling function
        System.out.println("Maximum Element of Matrix : " + max_element(matrix));

        sc.close();
    }
}
