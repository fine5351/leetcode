package easy;

import java.util.Arrays;

public class ThirdMaximumNumber {

    public static void main(String[] args) {
        ThirdMaximumNumber thirdMaximumNumber = new ThirdMaximumNumber();
        System.out.println(thirdMaximumNumber.thirdMax(new int[]{3, 2, 1}));
        System.out.println(thirdMaximumNumber.thirdMax(new int[]{1, 2}));
        System.out.println(thirdMaximumNumber.thirdMax(new int[]{2, 2, 3, 1}));
    }

    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (count == 0 || nums[i] != nums[i + 1]) {
                count++;
            }
            if (count == 3) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}
