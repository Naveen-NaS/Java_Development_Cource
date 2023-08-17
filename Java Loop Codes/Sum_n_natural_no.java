import java.util.Scanner;

public class Sum_n_natural_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last number of series : ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println("The sum of first " + n + " natural numbers : " + sum);
        sc.close();
    }
}
