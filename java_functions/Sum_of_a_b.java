import java.util.Scanner;
public class Sum_of_a_b {
    public static int Sum(int num1, int num2) { // num1 and num2 Parameters or Formal Parameter
        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any two Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Sum(a,b); //Function call   // a and b are here Arguments or Actual Parameters
        System.out.println(Sum(a, b));
        sc.close();
    }
}
