package easy;

public class SearchInsertPosition {

    public static void main(String[] args) {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        System.out.println(searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 5));
        System.out.println(searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 1));
        System.out.println(searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 6));

        System.out.println(searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 2));
        System.out.println(searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 4));
    }

    public int searchInsert(int[] nums, int target) {
        if (target < nums[0]) {
            return 0;
        }
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }
        int left = 0;
        int right = nums.length - 1;
        int middle = -1;
        while (left <= right) {
            middle = (left + right) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        System.out.println("middle " + middle);
        return nums[middle] < target ? middle + 1 : middle;
    }

}
