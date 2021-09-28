package easy;

public class SingleNumber {

    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        System.out.println(singleNumber.singleNumber(new int[]{1, 2, 2, 4, 4}));
    }

    public int singleNumber(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            answer = answer ^ nums[i];
        }
        return answer;
    }

}
