public class Substring {

    public static String subString(String str, int start_index, int end_index) {
        String subStr = "";
        for (int i = start_index; i < end_index; i++) {
            subStr += str.charAt(i);
        }
        return subStr;
    }

    public static void main(String[] args) {
        String str = new String("NaveenSharma");
        System.out.println(subString(str, 3, 8));

        // Instead of making a function for substring, In java there is in-built
        // function for it, "str.substring(start_index, end_index)".

        // Using in-built function
        System.out.println(str.substring(3, 8));
    }
}
