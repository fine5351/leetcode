package medium;

import java.util.Arrays;

public class KthLargestElementInAnArray {

    public static void main(String[] args) {
        KthLargestElementInAnArray kthLargestElementInAnArray = new KthLargestElementInAnArray();
        System.out.println(kthLargestElementInAnArray.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
        System.out.println(kthLargestElementInAnArray.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4));
    }

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
