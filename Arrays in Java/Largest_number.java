public class Largest_number {
    public static int largest_num(int num[]) {
        int largest = Integer.MIN_VALUE;  // - infinity value is sotred in largest variable.
        for(int i=0; i<num.length; i++) {
            if(largest<num[i]) {
                largest = num[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int num[] = {1,5,8,4,6,3,2,12,7,9};
        int l = largest_num(num);
        System.out.println("The largest number in List is " + l);
    }
}