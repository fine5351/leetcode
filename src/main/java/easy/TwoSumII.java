package easy;

import java.util.Arrays;

public class TwoSumII {

    public static void main(String[] args) {
        TwoSumII twoSumII = new TwoSumII();
        System.out.println(Arrays.toString(twoSumII.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSumII.twoSum(new int[]{2,3,4}, 6)));
    }

    public int[] twoSum(int[] numbers, int target) {
        if(numbers.length == 0){
            return null;
        }
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[2];
    }
}
