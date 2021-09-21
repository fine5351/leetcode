package easy;

import utils.PrintUtils;

import java.util.Arrays;

public class MaximumSubarray {

    public static void main(String[] args) {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        System.out.println(maximumSubarray.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println("------------------------");
        System.out.println(maximumSubarray.maxSubArray(new int[]{1, 2}));
        System.out.println("------------------------");
        System.out.println(maximumSubarray.maxSubArray(new int[]{1}));
        System.out.println("------------------------");
        System.out.println(maximumSubarray.maxSubArray(new int[]{1, -100}));
        System.out.println("------------------------");
        System.out.println(maximumSubarray.maxSubArray(new int[]{5, 4, -1, 7, 8}));
        System.out.println("------------------------");
        System.out.println(maximumSubarray.maxSubArray(new int[]{-2, 1}));
        System.out.println("------------------------");
        System.out.println(maximumSubarray.maxSubArray(new int[]{-2, -1}));
        System.out.println("------------------------");
    }

    public int maxSubArray(int[] nums) {
        int result = Integer.MIN_VALUE;
        int curSum = 0;
        for (int num : nums) {
            curSum = Math.max(curSum + num, num);
            result = Math.max(result, curSum);
        }
        return result;
    }

//    public int maxSubArray(int[] nums) {
//        int max = Integer.MIN_VALUE;
//        int[] dp = new int[nums.length];
//        dp[0] = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            dp[i] = dp[i - 1] + nums[i];
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length - i; j++) {
//                if (i == 0) {
//                    max = Math.max(max, dp[j]);
//                } else {
//                    max = Math.max(max, dp[i + j] - dp[i - 1]);
//                }
//            }
//        }
//        System.out.println(Arrays.toString(dp));
//        return max;
//    }
}
