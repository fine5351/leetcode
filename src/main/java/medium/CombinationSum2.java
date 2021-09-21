package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {

    private static int count = 0;

    public static void main(String[] args) {
        CombinationSum2 combinationSum2 = new CombinationSum2();
        combinationSum2.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8); // 1,1,2,5,6,7,10
        System.out.println("count : " + count);
        System.out.println("-----");
        combinationSum2.combinationSum2(new int[]{2, 5, 2, 1, 2}, 5); // 1, 2, 2, 2, 5
        System.out.println("count : " + count);
        System.out.println("-----");
        combinationSum2.combinationSum2(new int[]{1, 1}, 1);
        System.out.println("count : " + count);
        System.out.println("-----");
        combinationSum2.combinationSum2(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 30);
        System.out.println("count : " + count);
        System.out.println("-----");
        combinationSum2.combinationSum2(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 29);
        System.out.println("count : " + count);
        System.out.println("-----");

    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//        count = 0;
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        backTrack(0, candidates, target, output, result);
        return result;
    }

    private void backTrack(int index, int[] candidates, int target, List<Integer> output, List<List<Integer>> result) {
        count++;
        if (target < 0) {
            return;
        } else if (target == 0) {
            result.add(new ArrayList<Integer>(output));
        } else {
            for (int i = index; i < candidates.length; i++) {
                int nextVal = candidates[i];
                if (nextVal > target) {
                    return;
                }
                if (i != index && nextVal == candidates[i - 1]) {
                    continue;
                }
                output.add(candidates[i]);
                backTrack(i + 1, candidates, target - nextVal, output, result);
                output.remove(output.size() - 1);
            }
        }
    }

}
