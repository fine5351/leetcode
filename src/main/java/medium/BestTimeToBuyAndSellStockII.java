package medium;

public class BestTimeToBuyAndSellStockII {

    public static void main(String[] args) {
        BestTimeToBuyAndSellStockII bestTimeToBuyAndSellStockII = new BestTimeToBuyAndSellStockII();
        bestTimeToBuyAndSellStockII.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
    }

    public int maxProfit(int[] prices) {
        int[] dp = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            if (i > 0) {
                dp[i] = dp[i - 1] + (prices[i] > prices[i - 1] ? prices[i] - prices[i - 1] : 0);
            }
        }
        return dp[dp.length - 1];
    }
}
