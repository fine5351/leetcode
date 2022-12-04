package medium;

import java.util.ArrayList;
import java.util.List;

public class UglyNumberII {

    public static void main(String[] args) {
        UglyNumberII uglyNumberII = new UglyNumberII();
        System.out.println(uglyNumberII.nthUglyNumber(1));
        System.out.println(uglyNumberII.nthUglyNumber(10));
        System.out.println(uglyNumberII.nthUglyNumber(11));
        System.out.println(uglyNumberII.nthUglyNumber(1352));
    }

    public int nthUglyNumber(int n) {
        if (n < 1) {
            return 0;
        }
        int twoCount = 0;
        int threeCount = 0;
        int fiveCount = 0;
        List<Integer> resultList = new ArrayList<>();
        resultList.add(1);
        while (resultList.size() < n) {
            int m2 = 2 * resultList.get(twoCount);
            int m3 = 3 * resultList.get(threeCount);
            int m5 = 5 * resultList.get(fiveCount);
            int min = Math.min(Math.min(m2, m3), m5);
            resultList.add(min);
            if (min == m2) {
                twoCount++;
            }
            if (min == m3) {
                threeCount++;
            }
            if (min == m5) {
                fiveCount++;
            }
        }
        return resultList.get(n - 1);
    }
}