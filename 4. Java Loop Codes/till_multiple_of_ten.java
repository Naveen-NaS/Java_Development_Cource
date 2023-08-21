/*
 * In this code we have to take input from user and print it Untill user enter multiple of 10.
 * This loop also show the working of break statement. 
 */


import java.util.Scanner;

public class till_multiple_of_ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("NOTE :- This code keep working until you Enter Multiple of 10");
        while(true) {
        System.out.print("Enter any Number : ");
        int num = sc.nextInt();
           if(num%10 == 0) {
            break;
           }
           else {
            System.out.println(num);
           }
        }
        System.out.println("Loop Finished.");
        sc.close();
        
    }
}
