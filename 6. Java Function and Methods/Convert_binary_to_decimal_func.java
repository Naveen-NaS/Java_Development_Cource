import java.util.Scanner;

public class Convert_binary_to_decimal_func {
    public static void Decimal(int n) {
        int remainder = n;
        int pow = 0;
        int decimal = 0;
        while(remainder>0) {
            decimal = decimal + ((remainder%10) * (int)Math.pow(2, pow)); 
            remainder = (remainder)/10;
            pow++;
        }
        System.out.print("Decimal of binary number " + n + " is " + decimal);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary number : ");
        int n = sc.nextInt();
        Decimal(n);
        sc.close();
    }
}
