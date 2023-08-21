// Question Write Counting sort algorith in decreasing order.

import java.util.Arrays;

public class Question_4 {

    public static void Counting_sort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i < arr.length; i++) {
            largest =  Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Sorting
        int j = 0;
        for(int i=0; i < count.length; i++) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {4,2,7,8,1,3,6};
        Counting_sort(nums);
        System.out.println("Sorted Array : " + Arrays.toString(nums));
    }
}
