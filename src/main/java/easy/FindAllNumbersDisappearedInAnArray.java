package easy;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {

    public static void main(String[] args) {
        FindAllNumbersDisappearedInAnArray findAllNumbersDisappearedInAnArray = new FindAllNumbersDisappearedInAnArray();
        System.out.println(findAllNumbersDisappearedInAnArray.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
        System.out.println(findAllNumbersDisappearedInAnArray.findDisappearedNumbers(new int[]{1, 1}));
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int[] appear = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            appear[nums[i]]++;
        }
        for (int i = 1; i < appear.length; i++) {
            if (appear[i] == 0) {
                result.add(i);
            }
        }
        return result;
    }

}
