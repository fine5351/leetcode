package medium;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotateArray.rotate(array, 3);
        System.out.println(Arrays.toString(array));
    }

    public void rotate(int[] nums, int k) {
        int start = 0;
        int index = 0;
        int prev = 0;
        int now = nums[0];
        for (int i = 0; i < nums.length; i++) {
            prev = now;
            index = (index + k) % nums.length;
            now = nums[index];
            nums[index] = prev;
            if (index == start) {
                start = start + 1;
                index = start;
                now = nums[index];
            }
        }
    }

    private int calculateNextIndex(int now, int rotate, int max) {
        int nextIndex = now + rotate;
        return nextIndex >= max ? nextIndex - max : nextIndex;
    }
}
