/* Question : Given an Integer array nums, return all the triplets [nums[i], nums[j], nums[k]] 
   such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0
   Notice that the solution set must not contain duplicate triplets.
*/

public class Question_5 {

    public static void solution(int arr[]) {
        for(int i=0; i < arr.length; i++) {
            for(int j=0; j<arr.length; j++) {
                for(int k=0; k<arr.length; k++) {
                    if(((arr[i] + arr[j] + arr[k]) ==0) && (i!=j && j!=k && i!=k)) {
                        System.out.println("[" + arr[i] + "," + arr[j] + "," + arr[k] + "]");
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,5,0,2,-1};
        solution(nums);
    }
}