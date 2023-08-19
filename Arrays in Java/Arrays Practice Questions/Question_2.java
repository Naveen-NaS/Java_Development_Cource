/* Question : There is an integer array nums sorted in ascending order (with distinct values).
   Prior to being passed to your function, nums is possibly rotated at an unknown
   pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k],
   nums[k+l], ... , nums[n-l], nums[0], nums[l]] (0-indexed). 
   For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

   Given the array nums after the possible rotation and an integer target, return the
   index of target if it is in nums, or-I if it is not in nums.
   You must write an algorithm with O(log n) runtime complexity. 
*/


public class Question_2 {

    public static void searching_of_element(int arr[], int target) {
        int index = -1;
        for(int i=0; i < arr.length; i++) {
            if(arr[i] == target) {
                index = i;
            }
        }
        if(index == -1) {
            System.out.println(target + " is found in array at index " + index);
        }
        else {
            System.out.println(target + " is found in array at index " + index);
        }
        
    }
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        int target = 7;
        searching_of_element(nums, target);
    }
}
