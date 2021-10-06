package easy;

import java.util.*;

public class IsomorphicStrings {

    public static void main(String[] args) {
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
        System.out.println(isomorphicStrings.isIsomorphic("egg", "add"));
        System.out.println(isomorphicStrings.isIsomorphic("foo", "bar"));
        System.out.println(isomorphicStrings.isIsomorphic("paper", "title"));
        System.out.println(isomorphicStrings.isIsomorphic("", ""));
        System.out.println(isomorphicStrings.isIsomorphic("baba", "babc"));
    }

    public boolean isIsomorphic(String s, String t) {
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        int[] indexS = new int[256];
        int[] indexT = new int[256];
        for (int i = 0; i < charS.length; i++) {
            if (indexS[charS[i]] != indexT[charT[i]]) {
                return false;
            } else {
                indexS[charS[i]] = i + 1;
                indexT[charT[i]] = i + 1;
            }
        }
        return true;
    }

}
