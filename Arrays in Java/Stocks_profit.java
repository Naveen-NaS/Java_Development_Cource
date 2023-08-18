public class Stocks_profit {

    public static int stocks_profit(int arr[]) {
        int n = arr.length;
        int buying_price = Integer.MAX_VALUE;
        int max_profit = 0;
        buying_price = arr[0];
        for(int i=0; i < n; i++) {
            if(buying_price < arr[i]) {
                int profit = arr[i] - buying_price; // Today's Profit
                max_profit = Math.max(max_profit, profit);
            }
            else {
                buying_price = arr[i];
            }
        } 
        return max_profit;
    }

    public static void main(String[] args) {
        int price[] = {7,1,5,3,6,4};
        System.out.println(stocks_profit(price));
    }
}
