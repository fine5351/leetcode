package mdeium;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class GenerateParentheses {

    public static void main(String[] args) {
        List<String> list1 = new GenerateParentheses().generateParenthesis(3);
//        List<String> list2 = new ArrayList<>(Arrays.asList("((((()))))", "(((()())))", "(((())()))", "(((()))())", "(((())))()", "((()(())))", "((()()()))", "((()())())", "((()()))()", "((())(()))", "((())()())", "((())())()", "((()))(())", "((()))()()", "(()((())))", "(()(()()))", "(()(())())", "(()(()))()", "(()()(()))", "(()()()())", "(()()())()", "(()())(())", "(()())()()", "(())((()))", "(())(()())", "(())(())()", "(())()(())", "(())()()()", "()(((())))", "()((()()))", "()((())())", "()((()))()", "()(()(()))", "()(()()())", "()(()())()", "()(())(())", "()(())()()", "()()((()))", "()()(()())", "()()(())()", "()()()(())", "()()()()()"));
        list1.forEach(o -> System.out.println(o));
//        list2.removeAll(list1);
//        list2.forEach(o -> System.out.println(o));
    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backTrack("", n, n, result);
        return result;
    }

    private void backTrack(String current, int leftCount, int rightCount, List<String> result) {
        if (leftCount < 0 || rightCount < 0 || leftCount > rightCount) {
            return;
        } else if (leftCount == 0 && rightCount == 0) {
            result.add(current);
            return;
        } else {
            backTrack(current + "(", leftCount - 1, rightCount, result);
            backTrack(current + ")", leftCount, rightCount - 1, result);
        }
    }

}
