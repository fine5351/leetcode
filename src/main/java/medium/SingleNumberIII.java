package medium;

import java.util.Arrays;

public class SingleNumberIII {

    public static void main(String[] args) {
        SingleNumberIII singleNumberIII = new SingleNumberIII();
        System.out.println(Arrays.toString(singleNumberIII.singleNumber(new int[]{1, 2, 1, 3, 2, 5})));
    }

    public int[] singleNumber(int[] nums) {
        int exor = nums[0];
        for (int i = 1; i < nums.length; i++) {
            exor ^= nums[i];
        }
        exor &= -exor;
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & exor) == 0) {
                result[0] ^= nums[i];
            } else {
                result[1] ^= nums[i];
            }
        }
        return result;
    }
}
