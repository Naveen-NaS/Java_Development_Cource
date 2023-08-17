//Print this Pattern
//  A
//  BC
//  DEF
//  GHIJ


import java.util.Scanner;

public class Pattern04B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. of lines : ");
        int lines = sc.nextInt();
        char ch = 'A';
        for(int i=1; i <= lines; i++) {
            for(int j=1; j <= i; j++) {
                 System.out.print(ch);
                 ch++;
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
