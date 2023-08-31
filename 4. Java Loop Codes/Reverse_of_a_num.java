import java.util.Scanner;

public class Reverse_of_a_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        System.out.print("Reverse of input number : ");
        while (num != 0) {
            int r = num % 10;
            System.out.print(r);
            num = num / 10;
        }
        sc.close();
    }
}