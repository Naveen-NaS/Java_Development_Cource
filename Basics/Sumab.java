import java.util.Scanner;

public class Sumab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        
        int b = scan.nextInt();

        int sum = a + b;
        System.out.println("Sum of two Numbers is : " + sum);

        scan.close();
    }
}
