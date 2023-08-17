// Write a program that reads a set of integers, and then prints the sum of the
//even and odd integers.

import java.util.Scanner;

public class Sum_of_even_odd_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int choice = 1;
        int oddSum = 0;
        int evenSum = 0;

        while(choice != 0) {
            System.out.print("Enter a number : ");
            num = sc.nextInt();
            if(num%2 == 0) {
                evenSum+=num;
            }
            else {
                oddSum+=num;
            }

            System.out.print("Do you want to continue? Enter any number if Yes and 0 if No : ");
            choice = sc.nextInt();
        }
        System.out.println("Sum of Even numbers : " + evenSum);
        System.out.println("Sum of Odd numbers : " + oddSum);
        sc.close();
    }
}
