import java.util.Scanner;

public class Bit_Operations {

    public static int getIthBit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return (n | bitMask);
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return (n & bitMask);
    }

    public static int updateIthBit(int n, int i, int newBit) {
        if (newBit == 0) {
            return clearIthBit(n, i);
        } else {
            return setIthBit(n, i);
        }

        // Or we can also use this
        /*
         * n = clearIthBit(n, i);
         * int bitMask = newBit << i;
         * return n | bitMask;
         */
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        System.out.print("Enter the ith position of bit : ");
        int i = sc.nextInt();
        sc.close();

        // Getting bit of ith position
        System.out.println(getIthBit(num, i));

        // Setting bit of ith position to "1".
        System.out.println(setIthBit(num, i));

        // Clearing bit of ith position
        System.out.println(clearIthBit(num, i));

        // Update value of bit at ith position
        System.out.println(updateIthBit(num, i, 1));
    }
}
