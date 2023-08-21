// Question Write Selection sort algorith in decreasing order.

import java.util.Arrays;

public class Question_2 {

    public static void Selection_sort_dec(int arr[]) {
        int n = arr.length;
        for(int i=0; i < n-1; i++) {
            int min_position = i;
            for(int j=i+1; j < n; j++) {
                if(arr[min_position] > arr[j]) {
                    min_position = j;
                }
            }

            // Swap
            int temp = arr[min_position];
            arr[min_position] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,7,5,2,4,6};
        Selection_sort_dec(nums);
        System.out.println("Sorted Array : " + Arrays.toString(nums));
    }
}
