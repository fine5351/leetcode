package medium;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {

    public static void main(String[] args) {
        LargestNumber largestNumber = new LargestNumber();
        System.out.println(largestNumber.largestNumber(new int[]{3, 30, 34, 5, 9}));
        System.out.println(largestNumber.largestNumber(new int[]{10, 2}));
    }

    public String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return "0";
        }
        String[] numsString = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsString[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(numsString, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return -(o1 + o2).compareTo((o2 + o1));
            }
        });

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numsString.length; i++) {
            result.append(numsString[i]);
        }
        return result.charAt(0) != '0' ? result.toString() : "0";
    }

}
