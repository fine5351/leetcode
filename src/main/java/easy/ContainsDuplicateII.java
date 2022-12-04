package easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII {

    public static void main(String[] args) {
        ContainsDuplicateII containsDuplicateII = new ContainsDuplicateII();
        System.out.println(containsDuplicateII.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
        System.out.println(containsDuplicateII.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
        System.out.println(containsDuplicateII.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                set.remove(nums[i - k - 1]);
            }
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;

    }
//    public boolean containsNearbyDuplicate(int[] nums, int k) {
//        Map<Integer, Integer> map = new HashMap<>(10_000);
//        for (int i = 0; i < nums.length; i++) {
//            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
//                return true;
//            } else {
//                map.put(nums[i], i);
//            }
//        }
//        return false;
//    }
}
