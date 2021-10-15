package easy;

import utils.PrintUtils;

public class IsSubsequence {

    public static void main(String[] args) {
        IsSubsequence isSubsequence = new IsSubsequence();
        System.out.println(isSubsequence.isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubsequence.isSubsequence("axc", "ahbgdc"));
        System.out.println(isSubsequence.isSubsequence("b", "c"));
        System.out.println(isSubsequence.isSubsequence("acb", "ahbgdc"));
        System.out.println(isSubsequence.isSubsequence("bb", "ahbgdc"));
        System.out.println(isSubsequence.isSubsequence("b", "abc"));
    }

    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }
        if (t.isEmpty()) {
            return false;
        }
        int i = 0;
        int j = 0;
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        while (i < chars.length && j < chart.length) {
            if (chars[i] == chart[j]) {
                i++;
            }
            j++;
        }
        return i == chars.length;
    }

//    public boolean isSubsequence(String s, String t) {
//        if (s.isEmpty()) {
//            return true;
//        }
//        if (t.isEmpty()) {
//            return false;
//        }
//        int i = 0;
//        int j = 0;
//        char[] chars = s.toCharArray();
//        char[] chart = t.toCharArray();
//        while (i < chars.length && j < chart.length) {
//            if (chars[i] == chart[j]) {
//                i++;
//            }
//            j++;
//        }
//        return i == chars.length;
//    }

}
