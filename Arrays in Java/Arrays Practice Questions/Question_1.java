/* Question : Given an Integer array nums, return true if any value appears atleast twice in array,
 * and return false if every element is distinct.
 * 
 * Eg.  nums[] = {1,2,3,1}
 * o/p : true
 */


public class Question_1 {

    public static boolean check_element_repetition(int arr[]) {
        for(int i=0; i < arr.length-1; i++) {
            for(int j=i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,5,4,1,3,6};
        System.out.println(check_element_repetition(arr));
    }
}
