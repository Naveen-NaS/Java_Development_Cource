public class Counting_sort {

    public static void counting_sort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void print_Array(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int array[] = { 4, 8, 7, 2, 3, 1, 0, 2, 1, 7 };

        // Unsoted Array
        System.out.println("Unsorted Array :");
        print_Array(array);

        // Sorted Array
        counting_sort(array); // Swaping function calling
        System.out.println("Sorted Array : ");
        print_Array(array);

        System.out.println();
    }
}
