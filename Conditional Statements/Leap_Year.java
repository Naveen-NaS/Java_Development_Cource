// Write a Java program that takes a year from the user and print whether that year is a leap year or not.

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year : ");
        int year = sc.nextInt();
        boolean x = (year%4) == 0;
        boolean y = (year%100) != 0;

        // If a year not a century year then there is no problem
        // If a year is century year then it must divide from 100
        // And to satisfy condition of leap year it must be divisible by 400 also 

        boolean z = (year%100 == 0)  &&  (year%400 == 0);

        // So a year must be divisible by 4 and if it is a century year then it must be divisible by 400 and 100
        if( x && ( y || z)) {
            System.out.print(year + " is a Leap Year.");
        } 
        else {
            System.out.print(year + " is NOT a Leap Year.");
        }
        sc.close();     
    }
}
