import java.util.Scanner;
public class Check_Prime_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = sc.nextInt();

        boolean isPrime = true;

        // for(int i=2; i<num; i++) {
        //     if (num % i == 0) {
        //         isPrime = false;
        //         break;
        //     }
        // }


        /* Now in the above loop it is executing n-2 times and If we find any factor of number for i < square root of n.
        Then for loop is execute till square root of n times which is less than n-2, so for efficiency we use math package in java.*/

        // Efficient code
        for(int i=2; i<Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            System.out.print(num + " is a Prime Number.");
        } else {
            System.out.print(num + " is NOT a Prime Number.");
        }
        
        sc.close();
    }
}
