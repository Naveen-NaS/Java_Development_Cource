import java.util.Scanner;

public class prime_or_not_func {
    public static boolean Prime(int a) {
        for(int i=2; i <= Math.sqrt(a); i++) {
            if(a%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int a = sc.nextInt();
        boolean is_prime = Prime(a);
        if(is_prime == true) {
            System.out.println(a + " is a prime number");
        }
        else {
            System.out.println(a + " is NOT a prime number");
        }
        sc.close();
    }
}
