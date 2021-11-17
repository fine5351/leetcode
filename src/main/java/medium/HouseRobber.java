package medium;

import java.util.Arrays;

public class HouseRobber {

    public static void main(String[] args) {
        HouseRobber houseRobber = new HouseRobber();
        System.out.println(houseRobber.rob(new int[]{1, 2, 3, 1}));
        System.out.println(houseRobber.rob(new int[]{2, 7, 9, 3, 1}));
        System.out.println(houseRobber.rob(new int[]{2, 1, 1, 2}));
    }

    public int rob(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        System.out.println(Arrays.toString(dp));
        return dp[dp.length - 1];
    }
}
