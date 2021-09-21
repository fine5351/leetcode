package medium;

import java.util.Arrays;

public class ThreeSumClosest {

    public static void main(String[] args) {
        System.out.println(new ThreeSumClosest().threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
        System.out.println(new ThreeSumClosest().threeSumClosest(new int[]{0, 0, 0}, 1));
        System.out.println(new ThreeSumClosest().threeSumClosest(new int[]{-3,-2,-5,3,-4}, -1));
    }

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int startIndex = 0;
        int closest = 10_000;
        while (startIndex < nums.length - 2) {
            int left = startIndex + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[startIndex] + nums[left] + nums[right];
                closest = Math.abs(target - closest) > Math.abs(target - sum) ? sum : closest;
                if (sum == target) {
                    return target;
                } else if (sum < target) {
                    left++;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                } else {
                    right--;
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
            }
            startIndex++;
        }
        return closest;
    }
}
