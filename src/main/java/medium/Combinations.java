package medium;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

    public static void main(String[] args) {
        Combinations combinations = new Combinations();
        combinations.combine(4, 2);
        System.out.println("------------------");
        combinations.combine(1, 1);
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backTrack(0, n, k, new ArrayList<>(), result);
        return result;
    }

    private void backTrack(int now, int maxNum, int sizeLimit, List<Integer> output, List<List<Integer>> result) {
        if (now > maxNum) {
            return;
        }
        if (output.size() == sizeLimit) {
            for (int i = 0; i < output.size(); i++) {
                System.out.print(output.get(i) + ",");
            }
            System.out.println();
            result.add(new ArrayList<>(output));
        } else {
            for (int i = now; i <= maxNum; i++) {
                output.add(i + 1);
                backTrack(i + 1, maxNum, sizeLimit, output, result);
                output.remove(output.size() - 1);
            }
        }
    }
}
