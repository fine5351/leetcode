package easy;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        int[] array = new int[]{1, 1, 2};
        System.out.println(removeElement.removeElement(array, 1));
        System.out.println(Arrays.toString(array));
        System.out.println("-------------------");
        array = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeElement.removeElement(array, 2));
        System.out.println(Arrays.toString(array));
        System.out.println("-------------------");
        array = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeElement.removeElement(array, 2));
        System.out.println(Arrays.toString(array));
    }

    public int removeElement(int[] nums, int val) {
        int cur = 0;
        int run = 0;
        while (run < nums.length) {
            if (nums[run] != val && nums[cur] == val) {
                nums[cur] = nums[run];
                nums[run] = val;
                run++;
                cur++;
            } else if(nums[run] == val){
                run++;
            }
            else{
                run++;
                cur++;
            }
        }
        return cur;
    }
}
