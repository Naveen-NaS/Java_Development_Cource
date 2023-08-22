// String is a class associated in java.
// In Array .length is only parameter.
// But in Java .length() is a function that's why we put closing Paranthesis at End.

import java.util.Arrays;
import java.util.Scanner;

public class Strings_Basics {
    public static void main(String[] args) {
        // Declaration of Strings
        // Method 1
        char arr[] = { 'a', 'b', 'c', 'd' };
        // Method 2
        String str = "Naveen";
        // Method 3
        String str2 = new String(" Sharma");
        System.out.println(str + str2);
        System.out.println("Array : " + Arrays.toString(arr));

        /* Strings are IMMUTABLE */

        // Taking String as Input
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("Enter your name : ");
        name = sc.next(); // .next() takes only one word as input.
        sc.nextLine(); // Consume the newline character left in the buffer(For more info read text at
                       // end).
        System.out.println("Entered String is : " + name);

        String full_name;
        System.out.print("Enter your Full Name : ");
        full_name = sc.nextLine(); // .nextLine() takes whole line as input.
        System.out.println("Entered string is : " + full_name);

        // Calcuting Length of String
        System.out.println(full_name.length());

        // Concatenation
        String new_str = name + " " + full_name;
        System.out.println(new_str);

        // Character Positioning Function charAt(index) in java - Returns Value of char
        // at given index.
        System.out.println(full_name.charAt(5));

        sc.close();
    }
}

/*
 * After the name = sc.next(); line, when the user enters their name and presses
 * the Enter key,
 * only the word is consumed by sc.next(), but the newline character (\n)
 * remains in the input buffer.
 * 
 * When you then call full_name = sc.nextLine();, the newline character left in
 * the buffer from the
 * previous input is immediately consumed by sc.nextLine(), causing it to read
 * an empty line.
 */
