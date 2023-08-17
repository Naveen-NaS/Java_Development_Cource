import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        System.out.println(input);

        sc.nextLine(); // Consume the remaining newline character

        String name = sc.nextLine();
        System.out.println(name);

        int num = sc.nextInt();
        System.out.println(num);

        float price = sc.nextFloat();
        System.out.println(price);

        byte n1 = sc.nextByte();
        System.out.println(n1);

        double n2 = sc.nextDouble();
        System.out.println(n2);

        boolean n3 = sc.nextBoolean();
        System.out.println(n3);

        short n4 = sc.nextShort();
        System.out.println(n4);

        long n5 = sc.nextLong();
        System.out.println(n5);

        sc.close(); // Close the scanner to release resources
    }
}
