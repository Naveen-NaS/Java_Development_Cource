import java.util.Scanner;

public class print_n_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number till you want series : ");
        int range = sc.nextInt();
        int counter = 1;
         while(counter <= range) {
            System.out.print(" " + counter + " ");
            counter++;
         }

         sc.close();
    }
}
