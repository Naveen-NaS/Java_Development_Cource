import java.util.*;

public class Search_key {

    public static void input_elements(int arr[][]) {
        Scanner sc = new Scanner(System.in);

        int rows = arr.length;
        int columns = arr[0].length;
        System.out.print("Enter the Elements of Array : ");

        // Input
        for(int i=0; i < rows; i++) {
            for(int j=0; j < columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        sc.close();
    }

    public static void output_array(int arr[][]) {
        int rows = arr.length;
        int columns = arr[0].length;
        for(int i=0; i < rows; i++) {
            for(int j=0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

    }

    public static void search_key(int arr[][], int key) {
        int rows = arr.length;
        int columns = arr[0].length;
        boolean found = false;
        for(int i=0; i < rows; i++) {
            for(int j=0; j < columns; j++) {
                if(arr[i][j] == key) {
                    System.out.println(key + " is found at position (" + i + "," + j + ")");
                    found = true;
                }
            }
        }
        if(!found) {
            System.out.println(key + " is not found in Array.");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter no. of rows in 2D array : ");
        int rows = scan.nextInt();

        System.out.print("Enter no. of Columns in 2D array : ");
        int columns = scan.nextInt();

        int[][] matrix = new int[rows][columns];
        // Input
        input_elements(matrix);

        // Output
        output_array(matrix);

        // Searching
        search_key(matrix, 5);

        scan.close();
    }
}
