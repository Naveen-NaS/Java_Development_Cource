import java.util.Scanner;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2 };
        int[] nums2 = { 3, 4 };
        int j = 0;
        for (int i = nums1.length - 1; i < (nums2.length + nums1.length); i++) {
            nums1[i] = nums2[j];
            j++;
        }

        // sorting merged array
        Arrays.sort(nums1);

        int len = nums1.length;
        double median = 0.0;
        if (len % 2 == 0) {
            median = (double) (nums1[len / 2] + nums1[(len / 2) - 1]) / 2;
        } else {
            median = (nums1[len / 2]);
        }
        System.out.println(len);
        System.out.println(median);
    }
}
