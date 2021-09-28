package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TransferQueue;

public class Triangle {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
//        List<List<Integer>> list = new ArrayList<>();
//        list.add(Arrays.asList(1));
//        list.add(Arrays.asList(2, 3));
//        list.add(Arrays.asList(4, 5, 6));
//        list.add(Arrays.asList(7, 8, 9, 10));
//        System.out.println(triangle.minimumTotal(list));
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(2));
        list.add(Arrays.asList(3, 4));
        list.add(Arrays.asList(6, 5, 7));
        list.add(Arrays.asList(4, 1, 8, 3));
        System.out.println(triangle.minimumTotal(list));
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        List<Integer> dp = new ArrayList<>(triangle.get(triangle.size() - 1));
        for (int i = triangle.size() - 2; i >= 0; i--) {
            List<Integer> lastLevel = triangle.get(i);
            for (int j = 0; j <= i; j++) {
                dp.set(j, Math.min(dp.get(j), dp.get(j + 1)) + lastLevel.get(j));
            }
            System.out.println(dp);
        }
        return dp.get(0);
    }

//    public int minimumTotal(List<List<Integer>> triangle) {
//        List<List<Integer>> dp = new ArrayList<>();
//        dp.add(Arrays.asList(triangle.get(0).get(0)));
//        for (int i = 1; i < triangle.size(); i++) {
//            List<Integer> level = new ArrayList<>();
//            dp.add(level);
//            List<Integer> thisLevel = triangle.get(i);
//            int size = thisLevel.size();
//            List<Integer> lastLevel = dp.get(i - 1);
//            for (int j = 0; j < size; j++) {
//                int min = Integer.MAX_VALUE;
//                for (int k = 0; k < 2; k++) {
//                    if (j - k < lastLevel.size() && j - k >= 0) {
//                        min = Math.min(lastLevel.get(j - k) + thisLevel.get(j), min);
//                    }
//                }
//                level.add(min);
//            }
//            System.out.println(level);
//        }
//        List<Integer> finalPath = dp.get(dp.size() - 1);
//        finalPath.sort((o1, o2) -> o1 - o2);
//        return finalPath.get(0);
//    }


}
