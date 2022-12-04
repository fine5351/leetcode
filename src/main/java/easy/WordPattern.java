package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordPattern {

    public static void main(String[] args) {
        WordPattern wordPattern = new WordPattern();
        System.out.println(wordPattern.wordPattern("abba", "dog cat cat dog"));
        System.out.println(wordPattern.wordPattern("abba", "dog cat cat fish"));
        System.out.println(wordPattern.wordPattern("aaaa", "dog cat cat dog"));
        System.out.println(wordPattern.wordPattern("aba", "dog cat cat"));
    }

    public boolean wordPattern(String pattern, String s) {
        if (pattern == null || s == null) {
            return false;
        }
        Map<Character, List<Integer>> patternMap = new HashMap<>();
        Map<String, List<Integer>> sMap = new HashMap<>();
        char[] patterns = pattern.toCharArray();
        String[] columns = s.split(" ");
        if (patterns.length != columns.length) {
            return false;
        }
        for (int i = 0; i < patterns.length; i++) {
            List<Integer> patternIndexList = null;
            if (patternMap.containsKey(patterns[i])) {
                patternIndexList = patternMap.get(patterns[i]);
            } else {
                patternIndexList = new ArrayList<>();
                patternMap.put(patterns[i], patternIndexList);
            }
            patternIndexList.add(i);

            List<Integer> sIndexList = null;
            if (sMap.containsKey(columns[i])) {
                sIndexList = sMap.get(columns[i]);
            } else {
                sIndexList = new ArrayList<>();
                sMap.put(columns[i], sIndexList);
            }
            sIndexList.add(i);

            if (!patternIndexList.equals(sIndexList)) {
                return false;
            }
        }

        return true;
    }
}
