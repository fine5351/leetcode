package easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {

    public static void main(String[] args) {
        PascalsTriangleII pascalsTriangleII = new PascalsTriangleII();
//        System.out.println(pascalsTriangleII.getRow(1));
//        System.out.println(pascalsTriangleII.getRow(2));
        System.out.println(pascalsTriangleII.getRow(3));
//        System.out.println(pascalsTriangleII.getRow(4));
//        System.out.println(pascalsTriangleII.getRow(5));
    }

    public List<Integer> getRow(int rowIndex) {
        int level = rowIndex + 1;
        List<Integer> resultList = getInitList(level);
        for (int i = 0; i < level; i++) {
            resultList.set(i, 1);
            for (int j = i - 1; j >= 1; j--) {
                resultList.set(j, resultList.get(j - 1) + resultList.get(j));
            }
        }
        return resultList;
    }

    private List<Integer> getInitList(int initSize) {
        List<Integer> list = new ArrayList<>(initSize);
        for (int i = 0; i < initSize; i++) {
            list.add(0);
        }
        return list;
    }
}
