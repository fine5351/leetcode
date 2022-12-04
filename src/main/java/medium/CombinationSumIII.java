package medium;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {

    private static final Logger logger = LoggerFactory.getLogger(CombinationSumIII.class);

    public static void main(String[] args) {
        CombinationSumIII combinationSumIII = new CombinationSumIII();
        combinationSumIII.combinationSum3(3, 7);
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            backtrack(i, n, new ArrayList<>(), result, k);
        }
//        for (List<Integer> list : result) {
//            PrintUtils.printList(list);
//        }
        return result;
    }

    private void backtrack(int now, int remain, List<Integer> temp, List<List<Integer>> result, int size) {
//        logger.info("now : {}, remain : {}, temp : {}", now, remain, temp);
        if (now > remain || temp.size() > size) {
            return;
        } else if (now == remain && size == temp.size() + 1) {
            temp.add(now);
            result.add(new ArrayList<>(temp));
            temp.remove(temp.size() - 1);
        } else {
            remain = remain - now;
            temp.add(now);
            for (int i = now + 1; i <= 9; i++) {
                backtrack(i, remain, temp, result, size);
            }
            temp.remove(temp.size() - 1);
        }
    }

}
