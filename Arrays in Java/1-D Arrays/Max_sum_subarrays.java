public class Max_sum_subarrays {

    // USING BRUTE FORCE METHOD
    public static void maxSum_subarray(int arr[]) {
        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;;
        for(int i=0; i < arr.length; i++) {
            for(int j=i; j < arr.length; j++) {
                current_sum = 0;
                for(int k=i; k <= j; k++) {
                    current_sum = current_sum + arr[k];
                }
                System.out.println(current_sum);
                if(max_sum < current_sum) {
                    max_sum = current_sum;
                }
            }
        }
        System.out.println("Max sum = " + max_sum);
    }

/* Now the upper function include 3 nested loops which means it's
   time complexity is O(n pow 3), which is really bad time complexity 
   
   To reduce time complexity we use another method shown below.
   which can be done by prfix sum.
*/
    
    // USING PREFIX SUM ARRAY METHOD
    public static void maxSum_effective(int arr[]) {
        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];

        // Calculate prefix array
        for(int i=1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0; i < arr.length; i++) {
            int start = i;
            for(int j=0; j < arr.length; j++) {
                int end = j;

                current_sum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(max_sum < current_sum) {
                    max_sum = current_sum;
                }
            }
        }

        System.out.println("Max sum = " + max_sum);
    }

    /* now using prefix method time complexity is O(n pow 2) which is less than O(n pow 3)
       Here also a method known as Kadane's Algorithm, and it's time complexity is O(n).
     */


    // USING KADANE'S ALGORITHM
    public static void maxSum_method3(int arr[]) {
      int max_sum = Integer.MIN_VALUE ;
      int current_sum = 0;  
    
      for(int i=0; i < arr.length; i++) {
          current_sum = current_sum + arr[i];
          if(current_sum < 0) {
            current_sum = 0;
          }
          max_sum = Math.max(current_sum, max_sum);
        }

    System.out.println("Max sum = " + max_sum);
    }

    public static void main(String[] args) {
        int arr[] = {1,-2,3,-4,8,5,7,-9,10};
        // Using Brute Force Method
        maxSum_subarray(arr);

        // Using Prefix Sum Array Method. Below used function is have less time complexity than 1st one.
        maxSum_effective(arr);

        // Using Kadane's method
        maxSum_method3(arr);
    }
}
