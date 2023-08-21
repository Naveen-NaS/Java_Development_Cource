import java.util.Scanner;

public class Income_Tax_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your annual income : ");
        double income = sc.nextDouble();
        double tax;
        if(income < 500000.0){
            System.out.println("Tax amount = 0");
        }
        else if(income >= 500000.0 && income < 1000000.0) {
            tax = income*0.2;
            System.out.print("Tax required to pay : " + tax);
        }
        else {
            tax = income*0.3;
            System.out.print("Tax required to pay : " + tax);
        }

        sc.close();
    }
}
