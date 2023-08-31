// And Operator "&" 1 & 0 --> 0
//                  1 & 1 --> 1

// Or Operator "|"  0 | 1 --> 1
//                  0 | 0 --> 0

// XOR Operator "^" 0 ^ 0 --> 0   *Means agar dono same hai to 0
//                  0 ^ 1 --> 1   *and different hai to 1
//                  1 ^ 0 --> 1
//                  1 ^ 1 --> 1

// Not Operator "~"   ~0 --> 1  *It's a unary Operator
//                    ~1 --> 0

// Left Shift Operator "<<", It left sift the digit *For More info refer to notes.

// Right Shift Operator ">>", It right sift the digit *For More info refer to notes.

public class Bitwise_Operators {
    public static void main(String[] args) {
        // And "&" Operator
        System.out.println(5 & 6); // 4

        // Or "|" Operator
        System.out.println(5 | 6); // 7

        // XOR "^" Operator
        System.err.println(5 ^ 6); // 3

        // Not "~" Operator
        System.out.println(~5); // -6
        // ~ just add the original no. by 1 and put -ve sign in front of it.
        // for eg. ~2 -> -3 and ~(-456) -> 455 (it also makes negative nums positive).

        // Left Shift "<<" Operator
        System.out.println(5 << 2);

        // Right Shift ">>" Operator
        System.out.println(6 >> 1);
    }
}
