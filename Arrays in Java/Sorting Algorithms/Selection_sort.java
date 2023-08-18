public class Selection_sort {

    public static void selection_sort(int arr[]) {
        for(int i=0; i < arr.length-1; i++) {
            int minPosition = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[minPosition] > arr[j]) {  // To print sorted array in decreasing order just use > instead of <.
                    minPosition = j;
                }
            }

            // Swap
            int temp = arr[minPosition];
            arr[minPosition] = arr[i];
            arr[i] = temp;
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
        selection_sort(array); // Swaping function calling
        System.out.println("Sorted Array : ");
        print_Array(array);
    }
}
