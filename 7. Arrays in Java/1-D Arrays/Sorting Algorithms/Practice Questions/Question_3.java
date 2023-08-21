// Question Write Insertion sort algorith in decreasing order.


import java.util.Arrays;

public class Question_3 {

    public static void Insertion_sort(int arr[]) {
        for(int i=1; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }

            // Insertion
            arr[prev+1] = curr;
        }
    }

    public static void main(String[] args) {
        int[] nums = {4,8,2,7,3,1,6};
        Insertion_sort(nums);
        System.out.println("Sorted Array : " + Arrays.toString(nums));
    }
}
