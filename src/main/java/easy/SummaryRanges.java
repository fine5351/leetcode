package easy;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    public static void main(String[] args) {
        SummaryRanges summaryRanges = new SummaryRanges();
        System.out.println(summaryRanges.summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));
        System.out.println(summaryRanges.summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9}));
        System.out.println(summaryRanges.summaryRanges(new int[]{}));
        System.out.println(summaryRanges.summaryRanges(new int[]{-1}));
        System.out.println(summaryRanges.summaryRanges(new int[]{0}));
    }

    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) {
            return result;
        }
        String format = "%d->%d";
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                start = i;
            } else if (nums[i] - nums[i - 1] == 1) {
                end = i;
            } else {
                if (end - start > 0) {
                    result.add(String.format(format, nums[start], nums[end]));
                } else {
                    result.add(String.valueOf(nums[start]));
                }
                start = i;
                end = i;
            }
        }
        if (end - start > 0) {
            result.add(String.format(format, nums[start], nums[end]));
        } else {
            result.add(String.valueOf(nums[start]));
        }
        return result;
    }
}
