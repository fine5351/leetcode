package mdeium;

import java.util.Arrays;

public class SearchInRotatedSortedArray {

    public static void main(String[] args) {
        System.out.println(new SearchInRotatedSortedArray().search(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 1));
        System.out.println(new SearchInRotatedSortedArray().search(new int[]{9, 1, 2, 3, 4, 5, 6, 7, 8}, 1));
        System.out.println(new SearchInRotatedSortedArray().search(new int[]{1, 3}, 1));
        System.out.println(new SearchInRotatedSortedArray().search(new int[]{3, 1}, 1));
        System.out.println(new SearchInRotatedSortedArray().search(new int[]{3, 5, 1}, 3));
    }

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < nums[right]) {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return result;
    }
}
