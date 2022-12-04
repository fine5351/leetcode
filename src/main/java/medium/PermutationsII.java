package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII {

    public static void main(String[] args) {
        PermutationsII permutationsII = new PermutationsII();
        permutationsII.permuteUnique(new int[]{1, 1, 2});
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> resultList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            boolean[] used = new boolean[nums.length];
            backTrack(i, used, nums, new ArrayList<>(), resultList);
        }
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
                if (i > 0 && nums[i] == nums[i - 1] && used[i - 1]){
                    continue;
                }
                if (!used[i]) {
                    backTrack(i, used, nums, output, resultList);
                    output.remove(output.size() - 1);
                    used[i] = false;
                }
            }
        }
    }
//    public List<List<Integer>> permuteUnique(int[] nums) {
//        Set<List<Integer>> resultList = new HashSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            boolean[] used = new boolean[nums.length];
//            backTrack(i, used, nums, new ArrayList<>(), resultList);
//        }
//        resultList.forEach(result -> {
//            result.forEach(o -> System.out.print(o + " ,"));
//            System.out.println();
//        });
//        return resultList.stream().collect(Collectors.toList());
//    }
//
//    private void backTrack(int curIndex, boolean[] used, int[] nums, List<Integer> output, Set<List<Integer>> resultList) {
//        output.add(nums[curIndex]);
//        used[curIndex] = true;
//        if (output.size() == nums.length) {
//                resultList.add(new ArrayList<>(output));
//            return;
//        } else {
//            for (int i = 0; i < nums.length; i++) {
//                if (!used[i]) {
//                    backTrack(i, used, nums, output, resultList);
//                    output.remove(output.size() - 1);
//                    used[i] = false;
//                }
//            }
//        }
//    }
}
