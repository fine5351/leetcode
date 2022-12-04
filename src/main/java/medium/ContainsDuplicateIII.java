package medium;

import java.util.TreeSet;

public class ContainsDuplicateIII {

    public static void main(String[] args) {
        ContainsDuplicateIII containsDuplicateIII = new ContainsDuplicateIII();
        System.out.println(containsDuplicateIII.containsNearbyAlmostDuplicate(new int[]{2147483640, 2147483641}, 1, 00));
    }

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.ceiling(nums[i]) != null && set.ceiling(nums[i]) <= nums[i] + t) {
                return true;
            }
            if (set.floor(nums[i]) != null && nums[i] <= set.floor(nums[i])+ t) {
                return true;
            }
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}
