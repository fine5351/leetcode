package mdeium;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public static void main(String[] args) {
        Subsets subsets = new Subsets();
        subsets.subsets(new int[]{1, 2, 3});
        System.out.println("---------------------");
        subsets.subsets(new int[]{1});
        System.out.println("---------------------");
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            backTrack(0, nums, i, new ArrayList<>(), result);
        }
        return result;
    }

    private void backTrack(int now, int[] nums, int sizeLimit, List<Integer> output, List<List<Integer>> result) {
        if (now > nums.length) {
            return;
        } else if (output.size() == sizeLimit) {
            for (int i = 0; i < output.size(); i++) {
                System.out.print(output.get(i) + ",");
            }
            System.out.println();
            result.add(new ArrayList(output));
        } else {
            for (int i = now; i < nums.length; i++) {
                output.add(nums[i]);
                backTrack(i + 1, nums, sizeLimit, output, result);
                output.remove(output.size() - 1);
            }
        }
    }

}
