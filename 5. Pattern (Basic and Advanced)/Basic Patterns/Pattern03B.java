//Print this Pattern
//  1
//  12
//  123
//  1234

import java.util.Scanner;

public class Pattern03B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. of lines : ");
        int lines = sc.nextInt();
        for(int i=1; i <= lines; i++) {
            for(int j=1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
