public class String_Compression {

    public static String compress(String str) {
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) { // O(n)
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count.toString());
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaaabbbbcccddddd";

        // Printing Compressed string.
        System.out.println(compress(str));

        // Time compexity is O(n) in spite of having nested loop because inner while
        // loop also incrementing "i" which means the code will only execute to
        // "str.length()" times, that's why it have linear time complexity.
    }
}
