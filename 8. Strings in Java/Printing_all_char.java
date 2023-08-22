public class Printing_all_char {

    public static void char_of_string(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static void main(String[] args) {
        String name = new String("Naveen Sharma");
        // Calling Function
        char_of_string(name);
    }
}
