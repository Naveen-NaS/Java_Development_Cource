public class Print_subarrays {
    
    public static void printSubarrays(int arr[]) {
        int total_subarrays = 0;
        for(int i=0; i < arr.length; i++) {
            for(int j=i; j < arr.length; j++) {
                for(int k=i; k<j; k++) {
                    System.out.print(arr[k] + " ");
                }
                total_subarrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total no. of subarrays : " + total_subarrays);
    }

    public static void main(String[] args) {
        int num[] = {1,2,-3,4,8,-5,7,9,10};
        printSubarrays(num);
    }
}