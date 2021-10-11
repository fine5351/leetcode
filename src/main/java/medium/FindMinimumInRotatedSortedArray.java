package medium;

public class FindMinimumInRotatedSortedArray {

    public static void main(String[] args) {
        FindMinimumInRotatedSortedArray findMinimumInRotatedSortedArray = new FindMinimumInRotatedSortedArray();
        System.out.println(findMinimumInRotatedSortedArray.findMin(new int[]{3, 4, 5, 1, 2}));
        System.out.println(findMinimumInRotatedSortedArray.findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
        System.out.println(findMinimumInRotatedSortedArray.findMin(new int[]{11, 13, 15, 17}));
    }

    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return nums[right];
    }
}
