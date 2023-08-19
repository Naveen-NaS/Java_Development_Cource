// Question Write Bubble sort algorith in decreasing order.

public class Question_1 {

    public static void bubble_sort_dec(int arr[]) {
        for(int i=0; i < arr.length-1; i++) {
            for(int j=0; j < arr.length-1-i; j++) {
                if(arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printAraay(int arr[]) {
        for(int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int nums[] = {1,5,17,8,19,25,4,6,3};
        bubble_sort_dec(nums);
        printAraay(nums);
    }
}
