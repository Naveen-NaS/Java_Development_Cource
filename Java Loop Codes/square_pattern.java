import java.util.Scanner;

public class square_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of square : ");
        int s = sc.nextInt();
        for(int i=1; i<=s; i++) {
            for(int j=1; j<=s; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}