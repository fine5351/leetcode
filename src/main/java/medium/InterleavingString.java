package medium;

import utils.PrintUtils;

public class InterleavingString {

    public static void main(String[] args) {
        InterleavingString interleavingString = new InterleavingString();
//        System.out.println(interleavingString.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
//        System.out.println(interleavingString.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
//        System.out.println(interleavingString.isInterleave("", "", ""));
//        System.out.println(interleavingString.isInterleave("", "", "a"));
//        System.out.println(interleavingString.isInterleave("a", "b", "a"));
//        System.out.println(interleavingString.isInterleave("a", "b", "aba"));
//        System.out.println(interleavingString.isInterleave("ab", "bc", "bbac"));
//        System.out.println(interleavingString.isInterleave("aaaa", "aa", "aaa"));
        System.out.println(interleavingString.isInterleave("aa", "ab", "abaa"));
    }

    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.isEmpty() || s2.isEmpty()) {
            return s1.equals(s3) || s2.equals(s3);
        }
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        int m = s1.length();
        int n = s2.length();
        boolean[][] isInterleave = new boolean[m + 1][n + 1];
        isInterleave[0][0] = true;
        for (int i = 1; i <= m; i++) {
            isInterleave[i][0] = isInterleave[i - 1][0] && (s1.charAt(i - 1) == s3.charAt(i - 1));
        }
        for (int i = 1; i <= n; i++) {
            isInterleave[0][i] = isInterleave[0][i - 1] && (s2.charAt(i - 1) == s3.charAt(i - 1));
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                int s1Index = i - 1;
                int s2Index = j - 1;
                int s3Index = i + j - 1;
                if (s3Index < s3.length()) {
                    System.out.println(i + ", " + j + ", " + s1.charAt(s1Index) + " vs " + s2.charAt(s2Index) + " -> " + s3.charAt(s3Index));
                    isInterleave[i][j] =
                            (isInterleave[i - 1][j] && s1.charAt(s1Index) == s3.charAt(s3Index)) || (isInterleave[i][j - 1] && s2.charAt(s2Index) == s3.charAt(s3Index));
                }
            }
        }
        PrintUtils.print2DArray(isInterleave);
        return isInterleave[m][n];
    }
}
