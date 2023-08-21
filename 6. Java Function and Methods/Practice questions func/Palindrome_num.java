/* Aim : Write a Java program to check if a number is a palindrome in Java? ( 121 is a
palindrome, 321 is not)
A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is a
palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
palindrome because the reverse of 321 is 123, which is not equal to 321. */

import java.util.Scanner;

public class Palindrome_num {

    public static boolean isPalindrome(int n) {
        int palindrome = n;
        int reverse_num = 0;
        while(palindrome>0) {
            int remainder = palindrome%10;
            reverse_num = (reverse_num*10) + remainder;
            palindrome = palindrome/10;
        }
        if(reverse_num == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to check wheather it is palindrome or not : ");
        int num = sc.nextInt();
        System.out.println(isPalindrome(num));
        sc.close();
    }
}
