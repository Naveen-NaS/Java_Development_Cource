//Write a Java method to compute the average of three numbers.

import java.util.Scanner;

public class Average_three_num {

    public static int Average(int a, int b, int c) {
        int avg = (a + b + c)/3;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int n2 = sc.nextInt();
        System.out.print("Enter third number : ");
        int n3 = sc.nextInt();
        
        System.out.println("Average of given three numbers is : " + Average(n1, n2, n3));
        sc.close();
    }
}
