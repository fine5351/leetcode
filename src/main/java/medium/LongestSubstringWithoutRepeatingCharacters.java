package medium;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(solution.lengthOfLongestSubstring("abca"));
    }

    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128]; // current index of character
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        System.out.println(Arrays.toString(index));
        return ans;
    }
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