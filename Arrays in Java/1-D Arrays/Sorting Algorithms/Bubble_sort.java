public class Bubble_sort {

    public static void bubble_sort(int arr[]) {
        for(int turns=0; turns < arr.length - 1; turns++) {
            for(int i=0; i < (arr.length - 1 - turns); i++) {
                if(arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }

    public static void print_Array(int arr[]) {
        for(int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int array[] = {5,8,7,6,5,2,9,1,0,4};

        // Unsoted Array 
        System.out.println("Unsorted Array :");
        print_Array(array);

        // Sorted Array
        bubble_sort(array); // Swaping function calling
        System.out.println("Sorted Array : ");
        print_Array(array);
        
    }
}
