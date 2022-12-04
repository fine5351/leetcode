package medium;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HIndexII {

    private static final Logger logger = LoggerFactory.getLogger(HIndexII.class);

    public static void main(String[] args) {
        HIndexII hIndexII = new HIndexII();
        System.out.println(hIndexII.hIndex(new int[]{0, 1, 3, 5, 6}));
        System.out.println(hIndexII.hIndex(new int[]{1, 2, 100}));
        System.out.println(hIndexII.hIndex(new int[]{0}));//0
        System.out.println(hIndexII.hIndex(new int[]{100}));//1
    }

    public int hIndex(int[] citations) {
        int left = 0;
        int right = citations.length - 1;
        int length = citations.length;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (citations[mid] >= length - mid) {
                right = mid - 1;
            } else if (citations[mid] < length - mid) {
                left = mid + 1;
            }
        }
        return length - left;
    }
}
