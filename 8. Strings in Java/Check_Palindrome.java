import java.util.Scanner;

public class Check_Palindrome {

    public static boolean palindrome(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt((str.length() - 1 - i))) {
                // Not a Palindrome
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word to check wheather it's Palindrome or not : ");
        String str;
        str = sc.next();
        System.out.println(palindrome(str));

        sc.close();
    }
}
