public class Trapping_Rainwater {

    public static int trapped_water(int arr[]) {
        // Calculate left max boundary - array
        int n = arr.length;
        int leftmax[] = new int[n];
        leftmax[0] = arr[0];
        for(int i=1; i < n; i++) {
            leftmax[i] = Math.max(arr[i], leftmax[i-1]);
        }

        // Calculate right max boundary - array
        int rightmax[] = new int[n];
        rightmax[n - 1] = arr[n - 1];
        for(int i=(n-2); i >= 0; i--) {
            rightmax[i] = Math.max(arr[i], rightmax[i+1]);
        }

        // loop
        int trap_water = 0;
        for(int i = 0; i < n; i++) {
            // water level = min(leftmax boundary, rightmax boundary)
            int water_level = Math.min(leftmax[i], rightmax[i]);

            // trapped water = water level - height[i]
            trap_water += water_level - arr[i];
        }
        
        return trap_water;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println("Trapped Water : " + trapped_water(height));
    }
}
