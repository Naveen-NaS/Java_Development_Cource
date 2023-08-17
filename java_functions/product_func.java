import java.util.Scanner;

public class product_func {
    public static void Product(int num1,int num2) {
        int prod = num1 * num2;
        System.out.println("Product is : " + prod);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        Product(a, b);
        sc.close();
    }
}
