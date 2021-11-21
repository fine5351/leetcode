package medium;

import java.util.Arrays;

public class HouseRobberII {

    public static void main(String[] args) {
        HouseRobberII houseRobberII = new HouseRobberII();
//        System.out.println(houseRobberII.rob(new int[]{1, 2, 3, 1}));
//        System.out.println(houseRobberII.rob(new int[]{1, 7, 9, 4, 2}));
//        System.out.println(houseRobberII.rob(new int[]{2, 1, 1, 2}));
        System.out.println(houseRobberII.rob(new int[]{2, 3, 2}));
    }

    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int[] numsRemoveFirst = Arrays.copyOfRange(nums, 1, nums.length);
        int[] numsRemoveLast = Arrays.copyOfRange(nums, 0, nums.length - 1);
        return Math.max(robRemove(numsRemoveFirst), robRemove(numsRemoveLast));
    }

    private int robRemove(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[dp.length - 1];
    }
}
