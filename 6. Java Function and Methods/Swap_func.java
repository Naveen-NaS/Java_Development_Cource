// Swap - values exchange

public class Swap_func {
    public static void Swap(int a,int b) {
        //swap code
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        Swap(a, b);

        // jaise hi ham a and b ko main function ma call karenge
        // tab wo initial value hi print karega na ki swaped
        // call by value - means function tak variable ki copy value jati ha
        // java works on call by value

        // call by reference - means function tak variable ki original value jati ha
        // C++ works on call by reference
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
