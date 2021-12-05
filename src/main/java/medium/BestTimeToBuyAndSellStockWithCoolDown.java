package medium;

public class BestTimeToBuyAndSellStockWithCoolDown {

    public static void main(String[] args) {
        BestTimeToBuyAndSellStockWithCoolDown bestTimeToBuyAndSellStockWithCoolDown = new BestTimeToBuyAndSellStockWithCoolDown();
        System.out.println(bestTimeToBuyAndSellStockWithCoolDown.maxProfit(new int[]{1, 2, 3, 0, 2}));
    }

    public int maxProfit(int[] prices) {
        int dp[][] = new int[prices.length][2];
        // dp[每日價格(n個)][總交易次數(k次)][是否持有(0:無,1:有)], 因k為無限所以本題使用 dp[每日價格][是否持有]即可
        for (int i = 0; i < prices.length; i++) {
            if (i - 1 == -1) {
                //第一天, 未持有股票時無獲利, dp[0][0] = 0, 持有股票時扣除價格 dp[0][1] = -prices[i]
                dp[i][0] = 0;
                dp[i][1] = -prices[i];
            } else if (i - 2 == -1) {
                //第二天, 未持有股票的情況有兩種, max(昨天未持有(dp[i - 1][0]), 今日賣出(dp[i - 1][1] + prices[i]))
                dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
                //第二天, 持有股票的情況有兩種, max(昨天持有(dp[i - 1][1]), 今日買入(-prices[i])), 因為有冷卻時間所以昨天不會有賣出的利潤
                dp[i][1] = Math.max(dp[i - 1][1], -prices[i]);
            } else {
                //其他時間, 未持有股票的情況有兩種, max(昨天未持有(dp[i - 1][0]), 今日賣出(dp[i - 1][1] + prices[i]))
                dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
                //其他時間, 持有股票的情況有兩種, max(昨天持有(dp[i - 1][1]), 兩日前利潤 + 今日買入(-prices[i])), 因為有冷卻時間所以要從兩日前狀態計算
                dp[i][1] = Math.max(dp[i - 1][1], dp[i - 2][0] - prices[i]);
            }
        }
        return dp[prices.length - 1][0];
    }
}
