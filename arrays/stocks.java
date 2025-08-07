package arrays;

public class stocks {

    public static int Calculateprofit(int prices[]) {
        int n = prices.length;
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int i = 0; i < n; i++) {
            if (prices[i] < buyprice) {
                buyprice = prices[i];
            } else {
                int profit = prices[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        int result = Calculateprofit(prices);
        System.out.println("Maximum profit from stock prices: " + result);
    }
}
