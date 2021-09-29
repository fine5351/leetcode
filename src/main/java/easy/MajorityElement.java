package easy;

public class MajorityElement {

    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();
        System.out.println(majorityElement.majorityElement(new int[]{1, 1, 2}));
        System.out.println(majorityElement.majorityElement(new int[]{1, 1, 2, 2, 2}));
    }

    public int majorityElement(int[] nums) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                count++;
                max = nums[i];
            } else if (max == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return max;
    }
}
