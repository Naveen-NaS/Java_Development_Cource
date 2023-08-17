import java.util.Scanner;

public class Prime_no_in_range_func {
    public static boolean Prime(int a) {
        for(int i=2; i <= a-1; i++) {
            if(a%i==0) {
                return false;
            }
        }
        return true;
    }

    public static void Prime_in_range(int a) {
        for(int i=2; i <= a; i++) {
            if(Prime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("Prime numbers in range (2 to " + n + ") are :");
        Prime_in_range(n);
        sc.close();

    }
}