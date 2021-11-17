package learn.sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
//        int[] arr = new int[]{3, 2, 1, 5, 4};
        int[] arr = new int[]{5, 4, 3, 2, 1};
        quickSort.sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private void sort(int[] nums, int left, int right) {
        if (left < right) {
            int pivot = left;
            int low = left;
            int high = right;
            while (low < high) {
                while (nums[high] >= nums[pivot] && low < high) {
                    high--;
                }
                while (nums[low] <= nums[pivot] && low < high) {
                    low++;
                }
                swap(nums, low, high);
            }
            swap(nums, pivot, low);
            sort(nums, left, low - 1);
            sort(nums, low + 1, right);
        }
    }

    private void swap(int[] nums, int left, int right) {
        int temp = nums[right];
        nums[right] = nums[left];
        nums[left] = temp;
    }
}
