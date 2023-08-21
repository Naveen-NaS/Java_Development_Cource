import java.util.Arrays;

public class Sorting_using_single_loop {

    public static void sorting(int arr[]) {
        for(int i=0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                // Reset the index value to -1.
                i = -1;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {4,2,7,6,3,8,9,1,0};
        System.out.println("Original Array : " + Arrays.toString(nums));
        sorting(nums);
        System.out.println("Sorted Array : " + Arrays.toString(nums));
    }
}
