/* Aim : For a given set of Strings, print the largest String.
 * 
 * This can be done by using "Lexicographic Technique".
 * According to this Technique strings are not compared on the basis of their length,
 * Instead they comppared on the basis of "ASCII Value" of each character.
 * 
 * In java we don't need to make a seperate function for it, we can do this 
 * easily by using in-built function "str1.compareTo(str2)".
 * 
 * Now "compareTo" function also differ in b/w a and A,
 * if we want to treat lower-case and uppercase characters same then we use
 * "str1.compareToIgnoreCase(str2)"
 * 
 * compareTo() return 0 - if both are equal
 * return < 0 - if str1 is less than str2
 * return > 0 - if str1 is greater than 1 
*/

public class Largest_String {
    public static void main(String[] args) {
        String fruits[] = { "apple", "mango", "banana", "orange" };

        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) { // Time complexity is O(x+n)
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }

        System.out.println(largest);
    }
}
