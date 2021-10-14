package easy;

import java.util.*;

public class IntersectionOfTwoArraysII {

    public static void main(String[] args) {
        IntersectionOfTwoArraysII intersectionOfTwoArraysII = new IntersectionOfTwoArraysII();
        System.out.println(Arrays.toString(intersectionOfTwoArraysII.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
        System.out.println(Arrays.toString(intersectionOfTwoArraysII.intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})));
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            int appearCount = map.getOrDefault(nums1[i], 0) + 1;
            map.put(nums1[i], appearCount);
        }

        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums2.length; i++) {
            int appearCount = map.getOrDefault(nums2[i], 0);
            if (appearCount > 0) {
                list.add(nums2[i]);
                map.replace(nums2[i], appearCount - 1);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
