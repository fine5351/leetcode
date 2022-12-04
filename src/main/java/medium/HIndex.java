package medium;

import java.util.Arrays;

public class HIndex {

    public static void main(String[] args) {
        HIndex hIndex = new HIndex();
        System.out.println(hIndex.hIndex(new int[]{3, 0, 6, 1, 5}));
        System.out.println(hIndex.hIndex(new int[]{1, 3, 1}));
        System.out.println(hIndex.hIndex(new int[]{0, 1}));
    }

    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        for (int i = 0; i < n; i++) {
            if (citations[i] >= n - i) {
                return n - i;
            }
        }
        return 0;
    }
}
