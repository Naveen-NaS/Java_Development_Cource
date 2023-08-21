/* When we pass value of array to a function, it goes by it's
 * refrence position means changes done by any fuction must reflect in main().
 */
// Note : But if we pass a variable to any function it'll go by "Call by value".
// Note : But if we pass an array to any function it'll go by "Call by Reference".


public class Array_as_arguement {

    public static void update(int marks[]) {
        for(int i=0; i<marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {97, 85, 88, 75};

        update(marks); //function call

        // For printing list elements
        for(int i=0; i<marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

    }
}
