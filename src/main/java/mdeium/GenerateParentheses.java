package mdeium;

import utils.PrintUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class GenerateParentheses {

    public static void main(String[] args) {
        List<String> list1 = new GenerateParentheses().generateParenthesis(3);
        PrintUtils.printList(list1);
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
