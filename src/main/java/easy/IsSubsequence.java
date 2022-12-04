package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IsSubsequence {

    public static void main(String[] args) {
        IsSubsequence isSubsequence = new IsSubsequence();
//        System.out.println(isSubsequence.isSubsequence("abc", "ahbgdc"));
//        System.out.println(isSubsequence.isSubsequence("axc", "ahbgdc"));
//        System.out.println(isSubsequence.isSubsequence("b", "c"));
//        System.out.println(isSubsequence.isSubsequence("acb", "ahbgdc"));
//        System.out.println(isSubsequence.isSubsequence("bb", "ahbgdc"));
        System.out.println(isSubsequence.isSubsequence("b", "abc"));
    }

    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }
        if (t.isEmpty()) {
            return false;
        }
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        Map<Character, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < chart.length; i++) {
            List<Integer> appearIndexList = map.getOrDefault(chart[i], new ArrayList<>());
            appearIndexList.add(i);
            map.put(chart[i], appearIndexList);
        }

        int lastIndex = -1;
        for (int i = 0; i < chars.length; i++) {
            List<Integer> appearIndexList = map.get(chars[i]);
            if (appearIndexList == null) {
                return false;
            } else {
                int findIndex = findFirstAppearIndex(lastIndex, appearIndexList);
                lastIndex = findIndex;
                System.out.println("find char " + chars[i] + ", lastIndex " + i + ", first index " + findIndex);
                if (findIndex == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    private int findFirstAppearIndex(int lastIndex, List<Integer> list) {
        int left = 0;
        int right = list.size();
        while (left < right) {
            int mid = left + (right - left) / 2;
            int middle = list.get(mid);
            if (middle > lastIndex) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left == list.size() ? -1 : list.get(left);
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
