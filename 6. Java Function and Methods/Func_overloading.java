import java.util.Scanner;

public class Func_overloading {
    public static int Sum(int a, int b) {
        return a+b;
    }
    public static double Sum(double a, double b) {
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First integer number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second integer number : ");
        int num2 = sc.nextInt();
        System.out.println(Sum(num1, num2));


        System.out.println("Enter First floating number : ");
        double num3 = sc.nextDouble();
        System.out.println("Enter Second floating number : ");
        double num4 = sc.nextDouble();

        System.out.println(Sum(num3, num4));

        sc.close();
    }
}
