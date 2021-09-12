package mdeium;

public class JumpGame {

    public static void main(String[] args) {
        JumpGame jumpGame = new JumpGame();
        System.out.println(jumpGame.canJump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(jumpGame.canJump(new int[]{3, 2, 1, 0, 4}));
        System.out.println(jumpGame.canJump(new int[]{5, 9, 3, 2, 1, 0, 2, 3, 3, 1, 0, 0}));
    }

    public boolean canJump(int[] nums) {
        int n = nums.length;
        int reach = 0;
        for (int i = 0; i < n; i++) {
            if (i > reach || reach >= n - 1) {
                break;
            }
            reach = Math.max(reach, i + nums[i]);
        }
        return reach >= n - 1;
    }
//    public boolean canJump(int[] nums) {
//        if (nums.length == 1) {
//            return true;
//        } else if (nums[0] == 0) {
//            return false;
//        }
//        int curIndex = 0;
//        while (curIndex < nums.length) {
//            int nextIndex = curIndex;
//            int maxStepRange = 0;
//            if (curIndex + nums[curIndex] >= nums.length - 1) {
//                return true;
//            }
//            for (int i = 1; i <= nums[curIndex]; i++) {
//                int nextStepRange = curIndex + i + nums[curIndex + i];
//                if (nextStepRange >= nums.length - 1) {
//                    return true;
//                }
//                else if (nextStepRange >= maxStepRange) {
//                    maxStepRange = nextStepRange;
//                    nextIndex = curIndex + i;
//                }
//            }
//            if (curIndex == nextIndex) {
//                break;
//            }
//            curIndex = nextIndex;
//        }
//        return false;
//    }
}
