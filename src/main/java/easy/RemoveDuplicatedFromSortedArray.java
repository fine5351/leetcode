package easy;

import utils.PrintUtils;

import java.util.Arrays;

public class RemoveDuplicatedFromSortedArray {

    public static void main(String[] args) {
        RemoveDuplicatedFromSortedArray removeDuplicatedFromSortedArray = new RemoveDuplicatedFromSortedArray();
        int[] array = new int[]{1, 1, 2};
        System.out.println(removeDuplicatedFromSortedArray.removeDuplicates(array));
        System.out.println(Arrays.toString(array));
        System.out.println("-------------------");
        array = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicatedFromSortedArray.removeDuplicates(array));
        System.out.println(Arrays.toString(array));
    }

    public int removeDuplicates(int[] nums) {
        int cur = 0;
        int run = 0;
        while (run < nums.length) {
            if (nums[cur] == nums[run]) {
                run++;
            } else {
                cur++;
                nums[cur] = nums[run];
                run++;
            }
        }
        return cur + 1;
    }
}
