package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public static void main(String[] args) {
        MergeIntervals mergeIntervals = new MergeIntervals();
        mergeIntervals.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}});
        System.out.println("---------------------");
        mergeIntervals.merge(new int[][]{{1,4},{4,5}});
        System.out.println("---------------------");
        mergeIntervals.merge(new int[][]{{2, 3}, {5, 5}, {2, 2}, {3, 4}, {3, 4}});
        System.out.println("---------------------");
        mergeIntervals.merge(new int[][]{{1, 4}, {0, 4}});
    }

    public int[][] merge(int[][] intervals) {
        sort(intervals);
        List<int[]> blockList = new ArrayList<>();
        int blockStart = intervals[0][0];
        int blockEnd = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (blockEnd >= intervals[i][0]) {
                blockEnd = blockEnd > intervals[i][1] ? blockEnd :
                        intervals[i][1];
            } else {
                blockList.add(new int[]{blockStart, blockEnd});
                blockStart = intervals[i][0];
                blockEnd = intervals[i][1];
            }
        }
        blockList.add(new int[]{blockStart, blockEnd});

        int[][] result = new int[blockList.size()][2];
        for (int i = 0; i < result.length; i++) {
            result[i] = blockList.get(i);
            System.out.println(Arrays.toString(result[i]));
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
