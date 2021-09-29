package medium;

import java.util.*;

public class LongestConsecutive {

    public static void main(String[] args) {
        LongestConsecutive longestConsecutive = new LongestConsecutive();
        System.out.println(longestConsecutive.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
        System.out.println(longestConsecutive.longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
    }

    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int maxLength = 0;
        for (Integer x : set) {
            if (!set.contains(x - 1)) {
                int y = x;
                while (set.contains(y + 1)) {
                    y++;
                }
                maxLength = Math.max(maxLength, y - x + 1);
            }
        }

        return maxLength;
    }
//    public int longestConsecutive(int[] nums) {
//        if (nums == null || nums.length == 0) {
//            return 0;
//        }
//        Arrays.sort(nums);
//        int maxLength = 0;
//        int length = 1;
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] - nums[i - 1] == 0) {
//                continue;
//            } else if (nums[i] - nums[i - 1] == 1) {
//                length++;
//            } else {
//                maxLength = Math.max(maxLength, length);
//                length = 1;
//            }
//        }
//        maxLength = Math.max(maxLength, length);
//        return maxLength;
//    }
}
