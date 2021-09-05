package mdeium;

import java.util.Arrays;

public class FindFirstAndLastPosition {

    public static void main(String[] args) {
        FindFirstAndLastPosition findFirstAndLastPosition = new FindFirstAndLastPosition();
        System.out.println(Arrays.toString(findFirstAndLastPosition.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
        System.out.println(Arrays.toString(findFirstAndLastPosition.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6)));
        System.out.println(Arrays.toString(findFirstAndLastPosition.searchRange(new int[]{}, 0)));
    }

    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        int left = 0;
        int right = nums.length - 1;
        int mid = -1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] == target) {
                mid = middle;
                break;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        System.out.println(mid);

        if (mid >= 0) {
            for (int i = mid; i >= 0; i--) {
                if (nums[i] != nums[mid]) {
                    break;
                }
                result[0] = i;
            }
            for (int i = mid; i < nums.length; i++) {
                if (nums[i] != nums[mid]) {
                    break;
                }
                result[1] = i;
            }
        }


        return result;
    }
}
