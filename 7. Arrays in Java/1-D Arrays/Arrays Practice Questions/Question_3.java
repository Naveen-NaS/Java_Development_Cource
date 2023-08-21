/* Question : You are given an array prices where prices[i] is the price of a given stock
   on the ith day.
   Return the maximum profit you can achieve from this transaction. 
   If you cannot achieve any profit, return 0. 
*/


public class Question_3 {

    public static int profit(int arr[]) {
        int max_profit = 0;
        for(int i=0; i < arr.length-1; i++) {
            int buying_price = arr[i];
            int selling_price = arr[i+1];
            int current_profit = 0;
            if(buying_price < selling_price) {
               current_profit = selling_price - buying_price;
               max_profit = Math.max(max_profit, current_profit);
            }
            else if(buying_price == selling_price) {
               current_profit = 0;
               max_profit = Math.max(max_profit, current_profit);
            }
            
        }

        return max_profit;
    }

    public static void main(String[] args) {
        int[] prices = {4,1,2,3,5,1,10,5}; 
        System.out.println("Maximum Profit : " + profit(prices));
    }
}
