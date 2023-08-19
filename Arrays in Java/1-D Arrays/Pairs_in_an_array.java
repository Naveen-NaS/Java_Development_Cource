public class Pairs_in_an_array {
    public static void printPairs(int arr[]) {
        int total_pairs = 0;   // There is also and mathematical formula to find total  no. of pairs   n(n-1)/2   where n is total no. of elements in array.
        for(int i=0; i < arr.length; i++) {
            for(int j= i+1; j < arr.length; j++) {  // Time complexity is O(n square) as nested loops are used.
                System.out.print("(" + arr[i] + "," + arr[j] + ")  ");
                total_pairs++;
            }
            System.out.println(" ");
        }
        System.out.println("Total Pairs Printed : " + total_pairs);
    }

    public static void main(String[] args) {
        int num[] = {1,2,4,7,8,5,6};
        printPairs(num);
       }
}