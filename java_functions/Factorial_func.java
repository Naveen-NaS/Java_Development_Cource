import java.util.Scanner;

public class Factorial_func {
    public static int Factorial(int a) {
        int factorial = 1;
        for(int i=1; i <= a; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        
        int fact = Factorial(num);
        System.out.println("Factorial of number " + num + " is " + fact);
        sc.close();
    }
}
