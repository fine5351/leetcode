package mdeium;

public class SearchInRotatedSortedArrayII {

    public static void main(String[] args) {
        SearchInRotatedSortedArrayII searchInRotatedSortedArrayII = new SearchInRotatedSortedArrayII();
        System.out.println(searchInRotatedSortedArrayII.search(new int[]{2, 5, 6, 0, 0, 1, 2}, 0) == true);
        System.out.println(searchInRotatedSortedArrayII.search(new int[]{2, 5, 6, 0, 0, 1, 2}, 3) == false);
        System.out.println(searchInRotatedSortedArrayII.search(new int[]{2, 5, 6, 0, 0, 1, 2}, 2) == true);
        System.out.println(searchInRotatedSortedArrayII.search(new int[]{2, 5, 6, 0, 0, 1, 2}, 5) == true);
        System.out.println(searchInRotatedSortedArrayII.search(new int[]{7, 7, 8, 9, 1, 2, 3, 4, 5, 6}, 4) == true);
        System.out.println(searchInRotatedSortedArrayII.search(new int[]{1, 0, 1, 1, 1}, 0) == true);
        System.out.println(searchInRotatedSortedArrayII.search(new int[]{3, 1}, 1) == true);
    }

    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] < nums[right]) {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else if (nums[mid] > nums[right]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                right--;
            }
        }
        return false;
    }

}
