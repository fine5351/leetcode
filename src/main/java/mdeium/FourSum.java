package mdeium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

    public static void main(String[] args) {
        System.out.println(new FourSum().fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0).toString());
        System.out.println(new FourSum().fourSum(new int[]{2, 2, 2, 2}, 8).toString());
        System.out.println(new FourSum().fourSum(new int[]{2, 2, 2, 2, 2}, 8).toString());
        System.out.println(new FourSum().fourSum(new int[]{0, 0, 4, -2, -3, -2, -2, -3}, -1).toString());
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        List<List<Integer>> resultList = new ArrayList<>();
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        resultList.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }
                        right--;
                        while (left < right && nums[right] == nums[right + 1]) {
                            right--;
                        }
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
                while (nums[j] == nums[j + 1] && j < nums.length - 2) {
                    j++;
                }
            }
            while (nums[i] == nums[i + 1] && i < nums.length - 3) {
                i++;
            }
        }

        return resultList;
    }
}
