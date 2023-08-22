import java.util.Scanner;

public class Switch_Calculator {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number : ");
            double a = sc.nextDouble();
            System.out.println("Enter second number : ");
            double b = sc.nextDouble();
            System.out.println("Welcome! These are following mathematical operations : ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division A (a/b)");
            System.out.println("5. Division B (b/a)");
            System.out.println("6. Remainder A (a/b)");
            System.out.println("7. Remainder B (b/a)");
            System.out.println("Enter number of operation you want to use : ");
            int choice = sc.nextInt();

            switch (choice) {
                  case 1:
                        System.out.println("Addition : " + (a + b));
                        break;
                  case 2:
                        System.out.println("Subtraction : " + (a - b));
                        break;
                  case 3:
                        System.out.println("Multiplication : " + (a * b));
                        break;
                  case 4:
                        System.out.println("Division A (a/b) : " + (a / b));
                        break;
                  case 5:
                        System.out.println("Division B (b/a) : " + (b / a));
                        break;
                  case 6:
                        System.out.println("Remainder A (a/b) : " + (a % b));
                        break;
                  case 7:
                        System.out.println("Remainder B (b/a) : " + (b % a));
                        break;
                  default:
                        System.out.println("Invalid Input! Please Enter number from 1 to 7");
            }

            sc.close();
      }
}
