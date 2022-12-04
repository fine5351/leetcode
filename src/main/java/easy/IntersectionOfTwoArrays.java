package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        IntersectionOfTwoArrays intersectionOfTwoArrays = new IntersectionOfTwoArrays();
        System.out.println(Arrays.toString(intersectionOfTwoArrays.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
        System.out.println(Arrays.toString(intersectionOfTwoArrays.intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})));
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        int index1 = 0;
        int index2 = 0;
        Set<Integer> num1Set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            num1Set.add(nums1[i]);
        }

        Set<Integer> intersectionSet = new HashSet<Integer>();
        for (int i = 0; i < nums2.length; i++) {
            if (num1Set.contains(nums2[i])) {
                intersectionSet.add(nums2[i]);
            }
        }

        int[] result = new int[intersectionSet.size()];
        int index = 0;
        for (Integer integer : intersectionSet) {
            result[index] = integer;
            index++;
        }
        return result;
    }
}
