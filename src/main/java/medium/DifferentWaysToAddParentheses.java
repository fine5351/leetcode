package medium;

import utils.PrintUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DifferentWaysToAddParentheses {

    public static void main(String[] args) {
        DifferentWaysToAddParentheses differentWaysToAddParentheses = new DifferentWaysToAddParentheses();
        PrintUtils.printList(differentWaysToAddParentheses.diffWaysToCompute("2-1-1"));
    }

    Map<String, List<Integer>> map = new HashMap<>();
    public List<Integer> diffWaysToCompute(String expression) {
        if (map.containsKey(expression)) {
            return map.get(expression);
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {
            if ('+' == expression.charAt(i) || '-' == expression.charAt(i) || '*' == expression.charAt(i)) {
                List<Integer> left = diffWaysToCompute(expression.substring(0, i));
                List<Integer> right = diffWaysToCompute(expression.substring(i + 1));
                for (int j = 0; j < left.size(); j++) {
                    for (int k = 0; k < right.size(); k++) {
                        if ('+' == expression.charAt(i)) {
                            result.add(left.get(j) + right.get(k));
                        } else if ('-' == expression.charAt(i)) {
                            result.add(left.get(j) - right.get(k));
                        } else {
                            result.add(left.get(j) * right.get(k));
                        }
                    }
                }
            }
        }
        if (result.isEmpty()) {
            result.add(Integer.parseInt(expression));
        }
        map.put(expression, result);
        return result;
    }

}
