package interview.trendmicro;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution1 {

    public static void main(String[] args) {

    }

    public int solution(String S) {
        List<String> allSubStringList = new LinkedList<>();
        for(int i = 0; i < S.length() ; i++){
            for(int j = i+1; j <= S.length(); j++){
                if(i != j){
                    allSubStringList.add(S.substring(i,j));
                }
            }
        }

        Map<String, Integer> subStringAppearsCountMap = new HashMap<>();
        for(String subString : allSubStringList){
            int appearCount = subStringAppearsCountMap.getOrDefault(subString, 0) + 1;
            subStringAppearsCountMap.put(subString, appearCount);
        }

        List<String> uniqueSubStringList = new LinkedList<>();
        for(Map.Entry<String, Integer> entry : subStringAppearsCountMap.entrySet()){
            if(entry.getValue() == 1){
                uniqueSubStringList.add(entry.getKey());
            }
        }

        Integer min = Integer.MAX_VALUE;

        for(String subString : uniqueSubStringList){
            min = Math.min(min, subString.length());
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

//    public int solution(String S) {
//        List<String> a1 = new LinkedList<>();
//        for (int i = 0; i < S.length(); i++) {
//            for (int j = i + 1; j <= S.length(); j++) {
//                if (i != j)
//                    a1.add(S.substring(i, j));
//            }
//        }
//
//        TreeMap<String, Integer> a2 = new TreeMap<>();
//        for (String s : a1) {
//            a2.put(s, a2.getOrDefault(s, 0) + 1);
//        }
//
//        List<String> freshList = new LinkedList<>();
//
//        for (String s : a2.keySet()) {
//            if (a2.get(s) == 1) {
//                freshList.add(s);
//            }
//        }
//
//        TreeMap<String, Integer> dictionary = new TreeMap<>();
//        for (String s : freshList) {
//            dictionary.put(s, s.length());
//        }
//
//        List<Integer> newList = new LinkedList<>();
//
//        for (String s : dictionary.keySet()) {
//            newList.add(dictionary.get(s));
//        }
//
//        int ans = Integer.MAX_VALUE;
//
//        for (int i : newList) {
//            ans = Math.min(ans, i);
//        }
//        return ans == Integer.MAX_VALUE ? 0 : ans;
//    }


}
