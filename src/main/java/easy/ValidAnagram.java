package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main(String[] args) {
        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.isAnagram("anagram", "nagaram"));
        System.out.println(validAnagram.isAnagram("rat", "cat"));
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        if (s.equals(t)) {
            return true;
        }
        int[] sAppearCount = new int[26];
        int[] tAppearCount = new int[26];
        for (int i = 0; i < s.length(); i++) {
            sAppearCount[s.charAt(i) - 'a']++;
            tAppearCount[t.charAt(i) - 'a']++;
        }

        for (int i = 0; i < sAppearCount.length; i++) {
            if (sAppearCount[i] != tAppearCount[i]) {
                return false;
            }
        }
        return true;
    }
}
