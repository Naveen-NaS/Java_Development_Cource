import java.util.Scanner;

public class Binomial_coefficient_func {

    public static int Factorial(int a) {
        int fact = 1;
        for(int i=1; i <= a; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int Bino_coef(int a, int b){
        int n_fact = Factorial(a);
        int r_fact = Factorial(b);
        int n_r = a - b;
        int n_r_fact = Factorial(n_r);
        int binomial_coef = (n_fact)/(r_fact * n_r_fact);
        return binomial_coef;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To Calulate Binomial Coefficient : ");
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter value of r : ");
        int r = sc.nextInt();
        if(n>0 && r>0 && n>r) {
            int binomial_coef = Bino_coef(n, r);
            System.out.println("Binomial Coefficient : " + binomial_coef);
        }
        else {
            System.out.println("Invalid Input! Please Enter Valid Input");
            System.out.println("Like n>0, r>0, n>r");
        }
        sc.close();
    }
}
