import java.util.Scanner;

public class Convert_Decimal_to_Binary_func {

    public static void DectoBin(int n) {
        int binary = 0;
        int num = n;
        int pow = 0;
        while(n>0) {
            binary = binary + ((n%2) * (int)Math.pow(10, pow));
            n = n/2;
            pow++;
        }
        System.out.println("The Binary conversrion of " + num + " is " + binary);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = sc.nextInt();
        DectoBin(num);
        sc.close();
    }
}
