package medium;

public class MaximumProductSubarray {

    public static void main(String[] args) {
        MaximumProductSubarray maximumProductSubarray = new MaximumProductSubarray();
        System.out.println(maximumProductSubarray.maxProduct(new int[]{2, 3, -2, 4}));
        System.out.println(maximumProductSubarray.maxProduct(new int[]{-2, 0, -1}));
    }

    public int maxProduct(int[] nums) {
        int[] biggestDp = new int[nums.length];
        int[] smallestDp = new int[nums.length];
        biggestDp[0] = nums[0];
        smallestDp[0] = nums[0];
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            biggestDp[i] = Math.max(Math.max(biggestDp[i - 1] * nums[i], smallestDp[i - 1] * nums[i]), nums[i]);
            smallestDp[i] = Math.min(Math.min(biggestDp[i - 1] * nums[i], smallestDp[i - 1] * nums[i]), nums[i]);
            result = Math.max(biggestDp[i], result);
        }
        return result;
    }
}
