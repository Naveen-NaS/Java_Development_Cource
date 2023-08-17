import java.util.*;

public class Avg_3_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three Numbers : ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double avg = (n1 + n2 + n3)/3;
        System.out.println("Average of three numbers : " + avg);
        sc.close();
    }
}
