/* Aim : For a given String convert each the first letter of each word to uppercase. */

public class Uppercase_string {

    public static String toUppterCase(String str) {

        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        // Time complexity is O(n) as string builder is not taking any extra time.
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hi, i am naveen sharma";

        // Calling Function
        System.out.println(toUppterCase(str));
    }
}
