package mdeium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Permutations {

    public static void main(String[] args) {
        Permutations permutations = new Permutations();
        permutations.permute(new int[]{1, 2, 3});
    }

//    public List<List<Integer>> permute(int[] nums) {
//        List<List<Integer>> result = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            boolean[] used = new boolean[nums.length];
//            backTrack(i, used, nums, new ArrayList<>(), result);
//        }
//        return result;
//    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backTrack(0, used, nums, new ArrayList<>(), resultList);
        int size = resultList.size();
        for (int i = 0; i < size; i++) {
            List<Integer> input = resultList.get(i);
            int j = 0;
            while (j < nums.length - 1) {
                input = swap(input);
                resultList.add(input);
                j++;
            }
        }
        resultList.forEach(result -> {
            result.forEach(o -> System.out.print(o + " ,"));
            System.out.println();
        });
        return resultList;
    }

    private void backTrack(int curIndex, boolean[] used, int[] nums, List<Integer> output, List<List<Integer>> resultList) {
        output.add(nums[curIndex]);
        used[curIndex] = true;
        if (output.size() == nums.length) {
            resultList.add(new ArrayList<>(output));
            return;
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (!used[i]) {
                    backTrack(i, used, nums, output, resultList);
                    output.remove(output.size() - 1);
                    used[i] = false;
                }
            }
        }
    }

    private List<Integer> swap(List<Integer> input) {
        List<Integer> output = new ArrayList<>(input.size());
        for (int i = 1; i < input.size(); i++) {
            output.add(input.get(i));
        }
        output.add(input.get(0));
        return output;
    }

}
