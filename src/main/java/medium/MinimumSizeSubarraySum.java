package medium;

public class MinimumSizeSubarraySum {

    public static void main(String[] args) {
        MinimumSizeSubarraySum minimumSizeSubarraySum = new MinimumSizeSubarraySum();
        System.out.println(minimumSizeSubarraySum.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
        System.out.println(minimumSizeSubarraySum.minSubArrayLen(4, new int[]{1, 4, 4}));
        System.out.println(minimumSizeSubarraySum.minSubArrayLen(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1}));
        System.out.println(minimumSizeSubarraySum.minSubArrayLen(11, new int[]{1, 2, 3, 4, 5}));
    }

    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int size = nums.length + 1;
        int sum = 0;
        while (right < nums.length) {
            sum += nums[right];
            right++;
            while (sum >= target) {
                size = Math.min(size, right - left);
                sum -= nums[left];
                left++;
            }
        }
        return size == nums.length + 1 ? 0 : size;
    }
//    public int minSubArrayLen(int target, int[] nums) {
//        int left = 0;
//        int right = 0;
//        int size = nums.length + 1;
//        int sum = 0;
//        while (left < nums.length) {
//            if (right > left) {
//                if (right < nums.length) {
//                    sum += nums[right];
//                } else {
//                    left++;
//                    right = left;
//                    continue;
//                }
//            } else {
//                sum = nums[left];
//            }
//            if (sum >= target) {
//                size = Math.min(size, right - left + 1);
//                left++;
//                right = left;
//            } else if (sum < target) {
//                right++;
//            }
//        }
//        return size == nums.length + 1 ? 0 : size;
//    }

}
