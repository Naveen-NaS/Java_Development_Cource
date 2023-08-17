import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("Multiplication table of " + num + " : ");
        for(int i=1; i<=10; i++) {
            System.out.println(num + " x " + i + " = " + (num*i));
        }
        sc.close();

    }
}
