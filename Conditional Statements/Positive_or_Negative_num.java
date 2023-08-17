// Aim : Write a Java program to get a number from the user and print whether it is positive or negative?


import java.util.Scanner;

public class Positive_or_Negative_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        double number = sc.nextDouble();
        if(number >= 0) {
            System.out.println("Entered Number is Positive");
        } else {
            System.out.println("Entered Number is Negative");
        }

        //Same code an written by using ternary operators

        String result = (number >= 0)?"Entered Number is Positive":"Entered Number is Negative";
        System.out.println(result);

        sc.close();
    }
}