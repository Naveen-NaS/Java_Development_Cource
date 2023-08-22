/* Question 1 : Print the number of 7's that are in the 2d array.
   Example : Input - int[][] array =  { {47,8},{8,8,7} };
   Output - 2 
*/

public class Question_1 {

    public static int solution(int arr[][]) {
        int rows = arr.length;
        int cols = arr[0].length;

        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == 7) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] array = { { 1, 2, 4, 5 }, { 8, 2, 6, 7 }, { 8, 2, 7, 1 }, { 9, 3, 5, 7 } };

        System.out.println(solution(array));

    }
}