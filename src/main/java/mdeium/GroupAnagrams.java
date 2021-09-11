package mdeium;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {

    public static void main(String[] args) {
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        List<List<String>> resultList = groupAnagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        for (int i = 0; i < resultList.size(); i++) {
            for (int j = 0; j < resultList.get(i).size(); j++) {
                System.out.print(resultList.get(i).get(j) + ",");
            }
            System.out.println();
        }
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> resultMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            int[] counts = new int[26];
            for (char c : str.toCharArray()) {
                counts[c - 'a']++;
            }
            StringBuilder keyBuilder = new StringBuilder();
            for (int j = 0; j < counts.length; j++) {
                int count = counts[j];
                while (count > 0) {
                    keyBuilder.append((char) (j + 'a'));
                    count--;
                }
            }
            String key = keyBuilder.toString();
            if (resultMap.containsKey(key)) {
                resultMap.get(key).add(str);
            } else {
                List<String> temp = new ArrayList<>();
                temp.add(str);
                resultMap.put(key, temp);
            }

        }
        return resultMap.values().stream().collect(Collectors.toList());
    }

//    public List<List<String>> groupAnagrams(String[] strs) {
//        Map<String, List<String>> resultMap = new HashMap<>();
//        for (int i = 0; i < strs.length; i++) {
//            String string = strs[i];
//            String key = sort(string);
//            List<String> temp = null;
//            if (!resultMap.containsKey(key)) {
//                temp = new ArrayList<>();
//                resultMap.put(key, temp);
//            } else {
//                temp = resultMap.get(key);
//            }
//            temp.add(string);
//        }
//        return resultMap.values().stream().collect(Collectors.toList());
//    }
//
//    private String sort(String string) {
//        char[] chars = string.toCharArray();
//        Arrays.sort(chars);
//        return new String(chars);
//    }

}
