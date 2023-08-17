import java.util.Scanner;

public class factorial_of_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        long num = sc.nextLong();
        long term = 1;
        for(int i=0; i<num; i++) {
            term*=(num-i);
        }
        System.out.println("Factorial of given number : " + term);
        sc.close();

    }
}
