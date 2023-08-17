/* Aim : Write a method named isEven that accepts an int argument. 
The method should return true if the argument is even, or false otherwise. 
Also write a program to test your method. */

import java.util.Scanner;

public class Check_even {

    public static boolean isEven(int n) {
        if(n%2 == 0){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check it is even of not : ");
        int num = sc.nextInt();
        System.out.println(isEven(num));
        sc.close();
    }
}
