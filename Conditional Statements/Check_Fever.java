/*
 * Write a code so that it prints You have a fever if your temperature is above 100 
 * and otherwise prints You don't have a fever
 */


import java.util.Scanner;

public class Check_Fever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your body temperature (in degrees Fahrenheit) : ");
        double temp = sc.nextDouble();
        String result = (temp >= 100.0)?"You have Fever.":"You don't have Fever";
        System.out.print(result);
        
        sc.close();
    }
}
