package medium;

import utils.PrintUtils;

import java.util.Arrays;

public class SingleNumberII {

    public static void main(String[] args) {
        SingleNumberII singleNumberII = new SingleNumberII();
        System.out.println(singleNumberII.singleNumber(new int[]{1, 1, 3, 3, 1, 3, 10}));
//        System.out.println(singleNumberII.singleNumber(new int[]{2, 2, 3, 3, 2, 3, 10}));
//        System.out.println(singleNumberII.singleNumber(new int[]{4, 4, 3, 3, 4, 3, 10}));
//        System.out.println(singleNumberII.singleNumber(new int[]{1, 1, 3, 10, 1, 3, 3}));
//        System.out.println(singleNumberII.singleNumber(new int[]{2, 2, 10, 3, 2, 3, 2}));
//        System.out.println(singleNumberII.singleNumber(new int[]{4, 10, 3, 3, 4, 3, 4}));
    }

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            for (int j = 0; j < nums.length; j++) {
                sum += (nums[j] >> i) & 1;
            }
            result |= (sum % 3) << i;
        }
        return result;
    }
//    public int singleNumber(int[] nums) {
//        Arrays.sort(nums);
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (count == 0 || nums[i] == nums[i - 1]) {
//                count++;
//            }
//            else if (nums[i] != nums[i - 1]) {
//                if (count == 1) {
//                    return nums[i - 1];
//                } else {
//                    count = 1;
//                }
//            }
//        }
//        return nums[nums.length - 1];
//    }


}
