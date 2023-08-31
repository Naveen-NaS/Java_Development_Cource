public class Odd_Even {

    public static void odd_even(int num) {
        int lsb = (num & 1);
        if (lsb == 0) {
            System.out.println("Even NUmber");
        } else {
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args) {
        int num = 5;
        odd_even(num);
    }
}
