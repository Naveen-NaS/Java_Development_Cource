/*
 * Aim :- Display all numbers entered by user except multiple of ten.
 * This can be done by using continue statements.
 */


import java.util.Scanner;
public class Except_multi_of_ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 1;

        do {
            System.out.print("Enter any Number : ");
            int n = sc.nextInt();

            if(n%10 == 0) {
                continue;
            } else {
                System.out.println("Number was : " + n);
            }

            System.out.println("Do you want to continue?");
            System.out.println("If Yes - Press any key ");
            System.out.println("If No - Enter 0 ");
            c = sc.nextInt();
        } while(c != 0);

        sc.close();

    }
}
