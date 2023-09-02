/* Question 1 : Count how many times lowercase vowels occurred in a String entered by the user. */

public class Question_1 {

    public static int lowercase(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (('a' == str.charAt(i)) || ('e' == str.charAt(i)) || ('i' == str.charAt(i)) || ('o' == str.charAt(i))
                    || ('u' == str.charAt(i))) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "Naveen Sharma";
        System.out.println(lowercase(str));
    }
}
