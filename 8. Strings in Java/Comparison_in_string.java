/* If we try to compare strings directly by using == operator 
 * then it may work some time but may not work sometimes.
  */

public class Comparison_in_string {
    public static void main(String[] args) {
        String s1 = "Naveen";
        String s2 = "Naveen";
        String s3 = new String("Naveen");
        String s4 = new String("Naveen");

        if (s1 == s2) {
            System.out.println("Strings are Equal.");
        } else {
            System.out.println("Strings are NOT Equal.");
        }

        if (s1 == s3) {
            System.out.println("Strings are Equal.");
        } else {
            System.out.println("String are NOT Equal.");
        }

        if (s3 == s4) {
            System.out.println("Strings are Equal.");
        } else {
            System.out.println("String are NOT Equal.");
        }

        // Using of .equals() function.
        if (s1.equals(s4)) {
            System.out.println("Strings are Equal");
        } else {
            System.out.println("Strings are NOT Equal.");
        }

    }
}

/*
 * The output of First statement is "Equal" but for next two statements o/p is
 * "Not Equal".
 * As when we use "new" keyword to declare variables it create and new memory
 * location.
 * And if don't use new keyword then same values point to same location that's
 * why in first statement stings are "Equal"
 * 
 * "==" operator checks whether both are same at object level.
 * 
 * 
 * So to check whether strings are equal or not we have a in-built function in
 * java "str1.equals(str2)" and it returns value in boolean type.
 */