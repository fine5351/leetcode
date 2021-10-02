package medium;

import utils.PrintUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromePartitioning {

    public static void main(String[] args) {
        PalindromePartitioning palindromePartitioning = new PalindromePartitioning();
        palindromePartitioning.partition("aab").forEach(o -> {
            System.out.println(o);
        });
    }

    public List<List<String>> partition(String s) {
        boolean dp[][] = new boolean[s.length()][s.length()];
        int n = s.length();
//        for (int i = 0; i < n; i++) {
//            dp[i][i] = true;
//        }
//        for (int i = 0; i < n - 1; i++) {
//            dp[i][i + 1] = s.charAt(i) == s.charAt(i + 1);
//        }
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                dp[i][j] = dp[i + 1][j - 1] && (s.charAt(i) == s.charAt(j));
//            }
//        }

        for (int i = 0; i < s.length(); ++i) {
            Arrays.fill(dp[i], true);
        }

        for (int i = s.length() - 1; i >= 0; --i) {
            for (int j = i + 1; j < s.length(); ++j) {
                dp[i][j] = (s.charAt(i) == s.charAt(j)) && dp[i + 1][j - 1];
            }
        }
        PrintUtils.print2DArray(dp);
        List<List<String>> result = new ArrayList<>();
        backTrack(s, 0, dp, new ArrayList<>(), result);

        return result;
    }

    private void backTrack(String s, int start, boolean[][] dp, List<String> output, List<List<String>> result) {
        if (start == s.length()) {
            result.add(new ArrayList<>(output));
            return;
        }
        for (int i = start; i < s.length(); i++) {
            if (dp[start][i]) {
                output.add(s.substring(start, i + 1));
                backTrack(s, i + 1, dp, output, result);
                output.remove(output.size() - 1);
            }
        }
    }

}
