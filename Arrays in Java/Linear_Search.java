public class Linear_Search {
    public static void linearSearch(int numbers[], int key) {
        boolean result = false;
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == key) {
                System.out.println(key + " is found in Array at position " + (i+1) + ".");
                result = true;
                break;
            }
        }
        if(result==false) {
            System.out.println(key + " is not found in Array.");
        }
    }
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int key = 5;
        linearSearch(numbers, key);
    }
}
