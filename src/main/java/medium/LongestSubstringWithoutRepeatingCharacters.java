package medium;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(solution.lengthOfLongestSubstring("bbbbb"));
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
        System.out.println(solution.lengthOfLongestSubstring("aab"));
        System.out.println(solution.lengthOfLongestSubstring("dvdf"));
        System.out.println(solution.lengthOfLongestSubstring("tmmzuxt"));
    }

    public int lengthOfLongestSubstring(String s) {
        int[] index = new int[128];
        Arrays.fill(index, -1);
        char[] chars = s.toCharArray();
        int start = 0;
        int length = 0;
        int maxLength = 0;
        for (int i = 0; i < chars.length; i++) {
            if (index[(int) chars[i]] == -1 || index[(int) chars[i]] < start) {
//                System.out.println("add " + chars[i] + " : " + index[(int) chars[i]]);
                length++;
                maxLength = Math.max(maxLength, length);
            } else {
//                System.out.println("duplicate : " + chars[i] + " : " + index[(int) chars[i]]);
                length -= index[(int) chars[i]] - start;
                start = index[(int) chars[i]] + 1;
            }
            index[(int) chars[i]] = i;
        }
        maxLength = Math.max(maxLength, length);
        return maxLength;
    }


//    public int lengthOfLongestSubstring(String s) {
//        int n = s.length(), ans = 0;
//        int[] index = new int[128];
//        for (int j = 0, i = 0; j < n; j++) {
//            i = Math.max(index[s.charAt(j)], i);
//            ans = Math.max(ans, j - i + 1);
//            index[s.charAt(j)] = j + 1;
//        }
//        return ans;
//    }
//    public int lengthOfLongestSubstring(String s) {
//        if (s.length() <= 1) {
//            return s.length();
//        }
//
//        int maxLength = 0;
//        int startIndex = 0;
//        int searchIndex = startIndex;
//        char[] chars = s.toCharArray();
//        StringBuilder records = new StringBuilder();
//        while (startIndex < chars.length && searchIndex < chars.length) {
//            char val = chars[searchIndex];
//            if (records.indexOf(String.valueOf(val)) < 0) {
//                records.append(val);
//                if (records.length() > maxLength) {
//                    maxLength = records.length();
//                }
//                searchIndex++;
//            } else {
//                startIndex++;
//                searchIndex = startIndex;
//                records.delete(0, records.length());
//            }
//        }
//        return maxLength;
//    }
}