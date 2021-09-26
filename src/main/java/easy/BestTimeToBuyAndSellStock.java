package easy;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
        System.out.println(bestTimeToBuyAndSellStock.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(bestTimeToBuyAndSellStock.maxProfit(new int[]{5, 4, 3, 2, 1}));
    }

    public int maxProfit(int[] prices) {
        int minCost = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            minCost = Math.min(prices[i], minCost);
            maxProfit = Math.max(maxProfit, prices[i] - minCost);
        }
        return maxProfit;
    }
}
