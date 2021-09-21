package medium;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArrayII {

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArrayII removeDuplicatesFromSortedArrayII = new RemoveDuplicatesFromSortedArrayII();
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        System.out.println(removeDuplicatesFromSortedArrayII.removeDuplicates(nums));
        System.out.println("------------------");
        nums = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};
        System.out.println(removeDuplicatesFromSortedArrayII.removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums) {
            System.out.println("i : " + i + ", n : " + n);
            if (i < 2 || n > nums[i - 2]) {
                nums[i] = n;
                i++;
            }
            System.out.println(Arrays.toString(nums));
        }
        return i;
    }

//    public int removeDuplicates(int[] nums) {
//        int appearCount = 1;
//        int now = 0;
//        while (now < nums.length) {
//            int next = now + 1;
//            while (next < nums.length && nums[now] == nums[next]){
//                appearCount++;
//                if (appearCount > 2) {
//                    nums[next] = 100001;
//                }
//                next++;
//            }
//            now += appearCount;
//            appearCount = 1;
//        }
//        sort(nums);
//        System.out.println(Arrays.toString(nums));
//        int outIndex = nums.length;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > 10000) {
//                outIndex = i;
//                break;
//            }
//        }
//        return outIndex;
//    }
//
//    private void sort(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] > nums[j]) {
//                    int temp = nums[i];
//                    nums[i] = nums[j];
//                    nums[j] = temp;
//                }
//            }
//        }
//    }
}
