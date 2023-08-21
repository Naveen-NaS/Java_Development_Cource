//Write a Java program to input week number(1-7) and print day of week name using switch case.


import java.util.Scanner;

public class Switch_Weekdays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Week day number(1-7) : ");
        int week_num = sc.nextInt();
        switch (week_num) {
            case 1 :
                System.out.print("Monday");
                break;
            case 2 :
                System.out.print("Tuesday");
                break;
            case 3 :
                System.out.print("Wednesday");
                break;
            case 4 :
                System.out.print("Thursday");
                break;
            case 5 :
                System.out.print("Friday");
                break;
            case 6 :
                System.out.print("Saturday");
                break;
            case 7 :
                System.out.print("Sunday");    
                break;
            default:
                System.out.println("Invalid Input!");
                System.out.print("Please Enter number from 1-7");
                break;
        }
        sc.close();
    }
}
