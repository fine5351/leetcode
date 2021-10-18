package medium;

public class LongestPalindromeSubtring {

    public static void main(String[] args) {
        LongestPalindromeSubtring solution = new LongestPalindromeSubtring();
        System.out.println(solution.longestPalindrome("ccc"));
        System.out.println(solution.longestPalindrome("ac"));
        System.out.println(solution.longestPalindrome("abb"));
        System.out.println(solution.longestPalindrome("babad"));
    }

    public String longestPalindrome(String s) {
        String longestPalindrome = "";
        for (int i = 0; i < s.length(); i++) {
            String s1 = palindrome(s, i, i);
            String s2 = palindrome(s, i, i + 1);
            if (s1.length() > s2.length() && s1.length() > longestPalindrome.length()) {
                longestPalindrome = s1;
            }
            else if (s2.length() > s1.length() && s2.length() > longestPalindrome.length()) {
                longestPalindrome = s2;
            }
        }
        return longestPalindrome;
    }

    private String palindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
//    public String longestPalindrome(String s) {
//        char[] chars = s.toCharArray();
//        boolean[][] p = new boolean[chars.length][chars.length];
//        int maxBegin = 0;
//        int maxLenght = 1;
//        for (int i = 0; i < chars.length; i++) {
//            for (int j = 0; j < chars.length; j++) {
//                p[i][j] = i == j;
//            }
//        }
//
//        for (int i = 0; i < chars.length - 1; i++) {
//            if (chars[i] == chars[i + 1]) {
//                p[i][i + 1] = true;
//                maxBegin = i;
//                maxLenght = 2;
//            }
//        }
//
//        for (int len = 3; len <= chars.length; len++) {
//            for (int i = 0; i < chars.length - len + 1; i++) {
//                int j = i + len - 1;
//                if (p[i + 1][j - 1] && chars[i] == chars[j]) {
//                    p[i][j] = true;
//                    maxBegin = i;
//                    maxLenght = len;
//                }
//            }
//        }
//        return s.substring(maxBegin, maxBegin + maxLenght);
//    }
}
