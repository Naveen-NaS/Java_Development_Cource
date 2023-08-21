// Aim: Write a Java method to compute the sum of the digits in an integer.

import java.util.Scanner;

public class Sum_of_digits {

    public static int sum_digit(int a) {
        int sum = 0;
        while(a>0) {
            sum = sum + (a%10);
            a = a/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("Sum of digits of given number : " + sum_digit(n));
        sc.close();
    }
}
