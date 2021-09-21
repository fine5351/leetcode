package medium;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {

    public static void main(String[] args) {
        InsertInterval insertInterval = new InsertInterval();
        insertInterval.insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5});
    }

    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] newIntervals = new int[intervals.length + 1][2];
        for (int i = 0; i < intervals.length; i++) {
            newIntervals[i] = intervals[i];
        }
        newIntervals[intervals.length] = newInterval;
        sort(newIntervals);

        List<int[]> blockList = new ArrayList<>();
        int start = newIntervals[0][0];
        int end = newIntervals[0][1];
        for (int i = 1; i < newIntervals.length; i++) {
            if (end >= newIntervals[i][0]) {
                end = end >= newIntervals[i][1] ? end : newIntervals[i][1];
            } else {
                blockList.add(new int[]{start, end});
                start = newIntervals[i][0];
                end = newIntervals[i][1];
            }
        }
        blockList.add(new int[]{start, end});

        int[][] result = new int[blockList.size()][2];
        for (int i = 0; i < result.length; i++) {
            result[i] = blockList.get(i);
        }

        return result;
    }

    private void sort(int[][] nums) {
        int[] temp;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j][0] > nums[j + 1][0]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

}
