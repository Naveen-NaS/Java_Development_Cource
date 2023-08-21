public class Insertion_sort {

    public static void insertion_sort(int arr[]) {
        for(int i=1; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;

            // Finding out the correct position to insert
            while(prev >= 0 && arr[prev]>curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }

            // Insertion
            arr[prev+1] = curr;
        }
    }

    public static void print_Array(int arr[]) {
        for(int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int array[] = {4,8,7,2,3,1,0};
        
        // Unsoted Array 
        System.out.println("Unsorted Array :");
        print_Array(array);

        // Sorted Array
        insertion_sort(array); // Swaping function calling
        System.out.println("Sorted Array : ");
        print_Array(array);
    }
}
