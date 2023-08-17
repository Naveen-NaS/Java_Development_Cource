import java.util.Scanner;

public class Area_of_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side of Square : ");
        double s = sc.nextDouble();
        double area = s*s;
        System.out.println("Area of Square : " + area + " Unit Sq.");
        sc.close();
    }
}
