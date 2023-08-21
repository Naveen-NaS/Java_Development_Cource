public class Staircase_Search {

    public static boolean staircase_searching(int arr[][], int key) {
        int row = 0;
        int column = arr[0].length - 1;

        while (row < arr.length && column >= 0) {
            if (arr[row][column] == key) {
                System.out.println("Found at Position (" + row + "," + column + ").");
                return true;
            }
            // Moving to Left
            else if (key < arr[row][column]) {
                column--;
            }
            // Moving to Down
            else {
                row++;
            }
        }
        System.out.println("Key not Found!");
        return false;
    }

    public static void main(String[] args) {
        int[][] Matrix = { { 10, 12, 16, 26 }, { 14, 18, 21, 30 }, { 17, 27, 31, 36 }, { 25, 34, 40, 48 } };

        staircase_searching(Matrix, 34);
    }
}
