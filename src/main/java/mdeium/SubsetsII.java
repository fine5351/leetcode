package mdeium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SubsetsII {

    public static void main(String[] args) {
        SubsetsII subsetsII = new SubsetsII();
        subsetsII.printList(subsetsII.subsetsWithDup(new int[]{1, 2, 2}));
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        int size = 1;
        int last = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != last){
                last = nums[i];
                size = result.size();
            }
            int newSize = result.size();
            for (int j = newSize - size; j < newSize; j++) {
                List<Integer> temp = new ArrayList<>(result.get(j));
                temp.add(nums[i]);
                result.add(temp);
            }

        }
        return result;
    }

    private void printList(List<List<Integer>> result) {
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.get(i).size(); j++) {
                System.out.print(result.get(i).get(j) + ", ");
            }
            System.out.println();
        }
        System.out.println("---------------------");
    }

//    public List<List<Integer>> subsetsWithDup(int[] nums) {
//        Arrays.sort(nums);
//        List<List<Integer>> result = new ArrayList<>();
//        for (int i = 0; i <= nums.length; i++) {
//            backTrack(0, i, nums, new ArrayList<>(), result);
//        }
//        return result;
//    }
//
//    private void backTrack(int now, int sizeLimit, int[] nums, List<Integer> output,
//                           List<List<Integer>> result) {
//        if (output.size() == sizeLimit) {
//            result.add(new ArrayList<>(output));
//            return;
//        } else {
//            for (int i = now; i < nums.length; i++) {
//                output.add(nums[i]);
//                backTrack(i + 1, sizeLimit, nums, output, result);
//                output.remove(output.size() - 1);
//                while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
//                    i++;
//                }
//            }
//        }
//    }
}
