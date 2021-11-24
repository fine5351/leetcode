package medium;

import utils.PrintUtils;

import java.util.*;

public class MajorityElementII {

    public static void main(String[] args) {
        MajorityElementII majorityElementII = new MajorityElementII();
        PrintUtils.printList(majorityElementII.majorityElement(new int[]{3, 2, 3}));
//        PrintUtils.printList(majorityElementII.majorityElement(new int[]{1}));
//        PrintUtils.printList(majorityElementII.majorityElement(new int[]{1, 2}));
//        PrintUtils.printList(majorityElementII.majorityElement(new int[]{3, 4, 5, 3, 3, 4, 4}));
    }

    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        List<Integer> result = new ArrayList<>();
        int count = 0;
        int now = 0;
        int target = nums.length / 3;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0 || now == nums[i]) {
                count++;
                if (count == target + 1) {
                    result.add(nums[i]);
                }
            } else {
                count = 1;
            }
            now = nums[i];
        }
        if (count > target && !result.contains(now)) {
            result.add(now);
        }
        return result;
    }
}
