package medium;

import java.util.Arrays;

public class SortColors {

    public static void main(String[] args) {
        SortColors sortColors = new SortColors();
        int[] array = new int[]{2, 0, 2, 1, 1, 0};
        sortColors.sortColors(array);
        System.out.println(Arrays.toString(array));
        System.out.println("-------------");
        array = new int[]{2, 0, 1};
        sortColors.sortColors(array);
        System.out.println(Arrays.toString(array));
        System.out.println("-------------");
        array = new int[]{1, 2, 0};
        sortColors.sortColors(array);
        System.out.println(Arrays.toString(array));
        System.out.println("-------------");
    }

    public void sortColors(int[] nums) {
        int zeroIndex = 0;
        int twoIndex = nums.length - 1;
        for (int i = 0; i <= twoIndex; i++) {
            int temp = 0;
            if (nums[i] == 0) {
                temp = nums[zeroIndex];
                nums[zeroIndex] = nums[i];
                nums[i] = temp;
                zeroIndex++;
            }
            if (nums[i] == 2) {
                temp = nums[twoIndex];
                nums[twoIndex] = nums[i];
                nums[i] = temp;
                i--;
                twoIndex--;
            }

            System.out.println(Arrays.toString(nums));
        }
    }
//    public void sortColors(int[] nums) {
//        int temp = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] > nums[j]) {
//                    temp = nums[i];
//                    nums[i] = nums[j];
//                    nums[j] = temp;
//                }
//            }
//        }
//    }
}
