package medium;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        productOfArrayExceptSelf.productExceptSelf(new int[]{3, 4, 5, 6});
    }

    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        result[0] = 1;
        for (int i = 1; i < result.length; i++) {
            result[i] = nums[i - 1] * result[i - 1];
        }
        System.out.println(Arrays.toString(result));

        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= right;
            right *= nums[i];
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
//    public int[] productExceptSelf(int[] nums) {
//        int[] result = new int[nums.length];
//        int[] left2Right = new int[nums.length];
//        int[] right2Left = new int[nums.length];
//
//        left2Right[0] = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            left2Right[i] = left2Right[i - 1] * nums[i];
//        }
//
//        right2Left[right2Left.length - 1] = nums[nums.length - 1];
//        for (int i = right2Left.length - 2; i >= 0; i--) {
//            right2Left[i] = right2Left[i + 1] * nums[i];
//        }
////        System.out.println(Arrays.toString(left2Right));
////        System.out.println(Arrays.toString(right2Left));
//
//        for (int i = 0; i < result.length; i++) {
//            int prev = i > 0 ? left2Right[i - 1] : 1;
//            int next = i < result.length - 1 ? right2Left[i + 1] : 1;
//            result[i] = prev * next;
//        }
////        System.out.println(Arrays.toString(result));
//        return result;
//    }
}
