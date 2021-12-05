package medium;

public class LongestIncreasingSubsequence {

    public static void main(String[] args) {
        LongestIncreasingSubsequence longestIncreasingSubsequence = new LongestIncreasingSubsequence();
        System.out.println(longestIncreasingSubsequence.lengthOfLIS(new int[]{0, 3, 1, 6, 2, 2, 7}));
        System.out.println(longestIncreasingSubsequence.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
        System.out.println(longestIncreasingSubsequence.lengthOfLIS(new int[]{0, 1, 0, 3, 2, 3}));
        System.out.println(longestIncreasingSubsequence.lengthOfLIS(new int[]{7, 7, 7, 7, 7, 7, 7}));
        System.out.println(longestIncreasingSubsequence.lengthOfLIS(new int[]{4, 10, 4, 3, 8, 9}));
    }

    public int lengthOfLIS(int[] nums) {
        if(nums.length <= 1){
            return nums.length;
        }
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int result = 0;
        for (int i = 1; i < nums.length; i++) {
            int maxLength = 0;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    maxLength = Math.max(maxLength, dp[j]);
                }
            }
            dp[i] = maxLength + 1;
            result = Math.max(result, dp[i]);
        }
        return result;
    }

//    public int lengthOfLIS(int[] nums) {
//        if(nums.length <= 1){
//            return nums.length;
//        }
//        int[] dp = new int[nums.length];
//        dp[0] = 1;
//        int result = 0;
//        for (int i = 1; i < nums.length; i++) {
//            int maxLength = 0;
//            for (int j = 0; j < i; j++) {
//                if (nums[j] < nums[i]) {
//                    maxLength = Math.max(maxLength, dp[j]);
//                }
//            }
//            dp[i] = maxLength + 1;
//            result = Math.max(result, dp[i]);
//        }
//        return result;
//    }
}
