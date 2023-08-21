public class Reverse_an_array {
    public static void reverse(int arr[]) {
        int first = 0;
        int last = arr.length-1;

        while(first < last) {
            // swap
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};

        // Original array printing
        System.out.print("Original Array : ");
        for(int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Function call
        reverse(arr);
        System.out.println(" ");

        // Reversed Array Printing
        System.out.println("Reversed array");
        for(int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/* We can also create and extra array but it'll increase space complexity
 * To reduce space complexity we just declare three new variables, 
 * As space complexity of variable is constant i.e. O(1)
 * while space complexity of an array is O(N).
 */