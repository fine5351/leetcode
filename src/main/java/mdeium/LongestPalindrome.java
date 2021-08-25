package mdeium;

import java.util.Arrays;

public class LongestPalindrome {

    public static void main(String[] args) {
        LongestPalindrome solution = new LongestPalindrome();
        System.out.println(solution.longestPalindrome("ccc"));
        System.out.println(solution.longestPalindrome("ac"));
        System.out.println(solution.longestPalindrome("abb"));
        System.out.println(solution.longestPalindrome("babad"));
    }

    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        boolean[][] p = new boolean[chars.length][chars.length];
        int maxBegin = 0;
        int maxLenght = 1;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                p[i][j] = i == j;
            }
        }

        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                p[i][i + 1] = true;
                maxBegin = i;
                maxLenght = 2;
            }
        }

        for (int len = 3; len <= chars.length; len++) {
            for (int i = 0; i < chars.length - len + 1; i++) {
                int j = i + len - 1;
                if (p[i + 1][j - 1] && chars[i] == chars[j]) {
                    p[i][j] = true;
                    maxBegin = i;
                    maxLenght = len;
                }
            }
        }
        return s.substring(maxBegin, maxBegin + maxLenght);
    }
}
