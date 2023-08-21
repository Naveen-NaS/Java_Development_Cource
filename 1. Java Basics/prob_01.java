//What will be the type of result in the following Java code?

public class prob_01 {
    public static void main(String[] args) {
        byte b = 4;
        char c = 'a';
        short s = 512;
        int $ = 1000;
        float f = 3.14f;
        double d = 99.9954;
        double result = (f*d)+($%c)-(b*s); //Here modulus operator(%) gives remainder.
        System.out.println(result); //At the place of string 'a' ASCII value of a=97 is used.
    }
}