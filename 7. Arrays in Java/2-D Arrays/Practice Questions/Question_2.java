/* Question 2 : Print out the sum of the numbers in the second row of the "nums" array.
   Example : Input - int[][] nums = { {1,11,5},{41,21,3},{52,12,36} };
   Output - 65 
*/

public class Question_2 {

    public static int solution(int arr[][]) {
        int cols = arr[0].length;

        int sum = 0;
        for (int i = 0; i < cols; i++) {
            sum += arr[1][i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] nums = { { 10, 12, 16, 26 }, { 14, 18, 21, 30 }, { 17, 27, 31, 36 }, { 25, 34, 40, 48 } };

        // Calling func
        System.out.println("Sum of Elements of 2nd Row : " + solution(nums));
    }
}
