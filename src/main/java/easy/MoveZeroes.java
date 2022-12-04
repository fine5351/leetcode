package easy;

public class MoveZeroes {

    public static void main(String[] args) {
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroes(new int[]{0, 1, 0, 3, 12});
        moveZeroes.moveZeroes(new int[]{0, 0, 1});
    }

    public void moveZeroes(int[] nums) {
        int notZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[notZeroIndex];
                nums[notZeroIndex] = temp;
                notZeroIndex++;
            }
        }
    }

//    public void moveZeroes(int[] nums) {
//        int searchIndex = 0;
//        int zeroIndex = nums.length - 1;
//        while (searchIndex < zeroIndex) {
//            if (nums[searchIndex] == 0) {
//                moveArray(nums, searchIndex, zeroIndex);
//                nums[zeroIndex] = 0;
//                zeroIndex--;
//            }
//            else{
//                searchIndex++;
//            }
//        }
//    }
//
//    private void moveArray(int[] nums, int start, int end) {
//        for (int i = start; i < end; i++) {
//            nums[i] = nums[i + 1];
//        }
//    }
}
