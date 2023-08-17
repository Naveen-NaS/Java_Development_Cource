import java.util.Scanner;

public class Even_or_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number (Integer) : ");
        int n = sc.nextInt();
        if(n % 2 == 0) {
            System.out.println("Number is Even.");
        } else {
            System.out.println("Number is odd.");
        }

        sc.close();

    }
}
