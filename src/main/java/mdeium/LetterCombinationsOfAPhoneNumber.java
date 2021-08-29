package mdeium;

import java.util.*;
import java.util.stream.Collectors;

public class LetterCombinationsOfAPhoneNumber {

    public static void main(String[] args) {
        System.out.println(new LetterCombinationsOfAPhoneNumber().letterCombinations("23").toString());
    }

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return Collections.emptyList();
        }
        String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> resultList = new ArrayList<>();
        resultList.add("");
        for (int i = 0; i < digits.length(); i++) {
            List<String> temp = new ArrayList<>();
            for (char c : map[digits.charAt(i) - '0'].toCharArray()) {
                for (String s : resultList) {
                    temp.add(s + c);
                }
            }
            resultList = temp;
        }

        return resultList;
    }

}
