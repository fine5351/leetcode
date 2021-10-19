package learn.interview.morrision;

import easy.DeleteColumnsToMakeSorted;

public class Solution2 {

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.deleteColumns(new String[]{"cba", "daf", "ghi"}));
        System.out.println(solution2.deleteColumns(new String[]{"a", "b"}));
    }

    public int deleteColumns(String[] A) {
        int count = 0;
        for (int i = 0; i < A[0].length(); i++) {
            for (int j = 0; j < A.length - 1; j++) {
                if (A[j].charAt(i) - A[j + 1].charAt(i) > 0) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
