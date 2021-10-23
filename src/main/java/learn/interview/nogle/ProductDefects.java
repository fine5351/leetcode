package learn.interview.nogle;

import jdk.internal.icu.util.CodePointTrie;

import java.util.List;

public class ProductDefects {

    public static void main(String[] args) {

    }

    public static int largestArea(List<List<Integer>> samples) {
        if (samples.size() == 0) {
            return 0;
        }

        int m = samples.size();
        int n = samples.get(0).size();
        int maxLength = 0;

        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (samples.get(i - 1).get(j - 1) == 1) {
                    dp[i][j] = Math.min(Math.min(dp[i][j - 1], dp[i - 1][j - 1]), dp[i - 1][j]) + 1;
                    maxLength = Math.max(dp[i][j], maxLength);
                }
            }
        }
        return maxLength;
    }

}
