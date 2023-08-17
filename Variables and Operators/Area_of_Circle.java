import java.util.Scanner;
public class Area_of_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of Circle : ");
        double Radius = sc.nextDouble();
        double area = 3.14 * Radius * Radius;
        System.out.print("Area of Circle : " + area + " Unit Sq.");

        sc.close();

    }
}
