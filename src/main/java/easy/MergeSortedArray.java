package easy;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        mergeSortedArray.merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
        nums1 = new int[]{2, 0};
        nums2 = new int[]{1};
        mergeSortedArray.merge(nums1, 1, nums2, 1);
        System.out.println(Arrays.toString(nums1));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[i - m];
        }
        Arrays.sort(nums1);
    }

//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int searchIndex = 0;
//        int insertIndex = 0;
//        while (searchIndex < nums1.length && insertIndex < n) {
//            System.out.println("search : " + searchIndex + ", insert : " + insertIndex);
//            if (nums2[insertIndex] < nums1[searchIndex]) {
//                System.out.println("移動");
//                move(searchIndex, nums1);
//                System.out.println("插入 " + nums2[insertIndex] + " 於 " + searchIndex);
//                nums1[searchIndex] = nums2[insertIndex];
//                insertIndex++;
//            } else if (searchIndex >= m + insertIndex) {
//                System.out.println("填入 " + nums2[insertIndex] + " 於 " + searchIndex);
//                nums1[searchIndex] = nums2[insertIndex];
//                insertIndex++;
//            }
//            searchIndex++;
//        }
//    }
//
//    private void move(int start, int[] array) {
//        for (int i = array.length - 1; i > start; i--) {
//            array[i] = array[i - 1];
//        }
//    }
}
