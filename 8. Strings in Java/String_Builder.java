// String Builder is java class useed to make "Mutable Strings".

public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");

        // Storing characters to string
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        } // abcdefghijklmnopqrstuvwxyz - o/p
          // O(26)
          // O(n^2)

        System.out.println(sb.length());

        sb.toString(); // .toString() - This function convert any objecct into "String".

    }
}
