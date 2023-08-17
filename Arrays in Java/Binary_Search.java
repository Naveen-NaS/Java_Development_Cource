// Find the position of element of array using binary search.

public class Binary_Search {
    public static int  binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end) {
            int mid = (start + end)/2;

            if(arr[mid] == key) {
                return mid;
            }
            if(arr[mid] < key) {
                start = mid+1;
            }
            else if(arr[mid] > key){
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // For binary search Enter a sorted array. 
        int arr[] = {3,6,9,12,15,18,21,24,27,30,33,36};
        int key = 1;
        
        System.out.println("Index for key is : " + binarySearch(arr, key));
    }
}
