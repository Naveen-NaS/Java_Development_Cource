/* Question : Given n non-negative integers representing an elevation map where the width of
   each bar is 1 , compute how much water it can trap after raining.
   height = [0,1,0,2,1,0,3,2,1,2,1]
*/


public class Question_4 {

    public static int trapped_rain_water(int arr[]) {
        // Calculating Left Max Boundary
        int[] left_max_boundary = new int[arr.length];
        left_max_boundary[0] = arr[0];
        for(int i=1; i<arr.length; i++) {
            left_max_boundary[i] = Math.max(arr[i], left_max_boundary[i-1]);
        }
        
        // Calculating Right Max Boundary
        int[] right_max_boundary = new int[arr.length];
        right_max_boundary[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2; i >= 0; i--) {
            right_max_boundary[i] = Math.max(arr[i], right_max_boundary[i+1]);
        }
        
        // Calculating Trapped Water
        int trapped_water = 0;
        for(int i=0; i < arr.length; i++) {
            int water_level = Math.min(right_max_boundary[i], left_max_boundary[i]);
            trapped_water = trapped_water + water_level - arr[i];
        }

        return trapped_water;
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("trapped Water : " + trapped_rain_water(height));
    }
}
