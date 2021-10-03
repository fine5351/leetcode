package medium;

import java.util.*;

public class WordBreak {

    public static void main(String[] args) {
        WordBreak wordBreak = new WordBreak();
//        System.out.println(wordBreak.wordBreak("leetcode", Arrays.asList("leet", "code")));
//        System.out.println(wordBreak.wordBreak("applepenapple", Arrays.asList("apple","pen")));
        System.out.println(wordBreak.wordBreak("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat")));
//        System.out.println(wordBreak.wordBreak("aaaaaaa", Arrays.asList("aaa", "aaaa")));
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < i; j++) {
                String sub = s.substring(j, i);
                System.out.println(sub);
                dp[i] = dp[j] && wordSet.contains(sub);
                if (dp[i]) {
                    break;
                }
            }
        }
        return dp[dp.length - 1];
    }

}
