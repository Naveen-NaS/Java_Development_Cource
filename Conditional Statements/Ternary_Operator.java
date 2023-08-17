import java.util.Scanner;

public class Ternary_Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String Check = (num % 2 == 0)?"Number is Even":"Number is Odd";
        System.out.print(Check);
        sc.close();
    }
}
