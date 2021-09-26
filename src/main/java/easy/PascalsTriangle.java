package easy;

import utils.PrintUtils;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static void main(String[] args) {
        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        List<List<Integer>> resultList = pascalsTriangle.generate(5);
        resultList.forEach(o -> PrintUtils.printList(o));
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resultList = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i++) {
            List<Integer> thisLevel = getInitList(i + 1);
            if (i > 0) {
                List<Integer> preLevel = resultList.get(i - 1);
                for (int j = 1; j < thisLevel.size() - 1; j++) {
                    thisLevel.set(j, preLevel.get(j - 1) + preLevel.get(j));
                }
            }
            resultList.add(thisLevel);
        }
        return resultList;
    }

    private List<Integer> getInitList(int initSize) {
        List<Integer> list = new ArrayList<>(initSize);
        for (int i = 0; i < initSize; i++) {
            list.add(0);
        }
        list.set(0, 1);
        list.set(list.size() - 1, 1);
        return list;
    }
}
