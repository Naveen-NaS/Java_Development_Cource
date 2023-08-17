import java.util.Scanner;

public class Largest_of_2_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if(A > B) {
            System.out.println("The Largest number is " + A);
        }
        else if(A < B) {
            System.out.println("The Largest number is " + B);
        }
        else {
            System.out.println("Both numbers are equal");
        }

        sc.close();
    }
}