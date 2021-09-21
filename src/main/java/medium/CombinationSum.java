package medium;

import java.util.*;

public class CombinationSum {

    public static void main(String[] args) {
        CombinationSum combinationSum = new CombinationSum();
//        combinationSum.combinationSum(new int[]{2, 3, 6, 7}, 7);
//        System.out.println("----------------");
//        combinationSum.combinationSum(new int[]{2, 3, 6, 7}, 8);
//        System.out.println("----------------");
//        combinationSum.combinationSum(new int[]{2, 3, 6, 7}, 10);
//        System.out.println("----------------");
//        combinationSum.combinationSum(new int[]{1}, 2);
//        System.out.println("----------------");
//        combinationSum.combinationSum(new int[]{2}, 1);
//        System.out.println("----------------");
//        combinationSum.combinationSum(new int[]{1,2}, 4);
//        System.out.println("----------------");
        combinationSum.combinationSum(new int[]{1, 3}, 4);
        System.out.println("----------------");
        combinationSum.combinationSum(new int[]{1, 3}, 6);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        backTrack(0, candidates, target, new ArrayList<>(), result);
        return result;
    }

    private void backTrack(int bits, int[] candidates, int target, List<Integer> temp, List<List<Integer>> result) {
        if (target < 0) {
            return;
        } else if (target == 0) {
            result.add(new ArrayList<>(temp));
            return;
        } else {
            for (int i = bits; i < candidates.length; i++) {
                if (target >= candidates[i]) {
                    temp.add(candidates[i]);
                    backTrack(i, candidates, target - candidates[i], temp, result);
                    temp.remove(temp.size() - 1);
                }
            }
        }
    }

}
