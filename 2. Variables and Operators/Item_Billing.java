/*Enter cost of 3 items from the user (using float datatype)-a pencil,a pen and an eraser. 
You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem). */

import java.util.*;
public class Item_Billing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost of Pencil : ");
        double pencil_cost = sc.nextDouble();
        System.out.println("Enter cost of Pen : ");
        double pen_cost = sc.nextDouble();
        System.out.println("Enter cost of Eraser : ");
        double eraser_cost = sc.nextDouble();

        System.out.println("Enter number of Pencil Purchased : ");
        double pencil_unit = sc.nextDouble();
        System.out.println("Enter number of Pen Purchased : ");
        double pen_unit = sc.nextDouble();
        System.out.println("Enter number of Eraser Purchased : ");
        double eraser_unit = sc.nextDouble();

        double pencil_price = pencil_cost * pencil_unit;
        double pen_price = pen_cost * pen_unit;
        double eraser_price = eraser_cost * eraser_unit;

        double actual_amt = pencil_price + pen_price + eraser_price;
        System.out.println("Total Actual Amount : " + actual_amt);

        double gst = (actual_amt * 18)/100;
        System.out.println("GST amt. : " + gst);

        double pay_amt = actual_amt + gst;
        System.out.println("Amount Payable : " + pay_amt);

        sc.close();
        }
}
