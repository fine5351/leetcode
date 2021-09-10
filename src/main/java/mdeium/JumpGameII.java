package mdeium;

import java.util.Arrays;

public class JumpGameII {

    public static void main(String[] args) {
        JumpGameII jumpGameII = new JumpGameII();
        System.out.println(jumpGameII.jump(new int[]{2, 3, 1, 1, 4}));
        System.out.println("----------");
        System.out.println(jumpGameII.jump(new int[]{2, 3, 0, 1, 4}));
        System.out.println("----------");
        System.out.println(jumpGameII.jump(new int[]{1, 1, 2, 2, 0, 3, 1, 1, 1}));
        System.out.println("----------");
        System.out.println(jumpGameII.jump(new int[]{1, 2, 1, 1, 1}));
        System.out.println("----------");
        System.out.println(jumpGameII.jump(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 1, 0}));
        System.out.println("----------");
        System.out.println(jumpGameII.jump(new int[]{2, 1}));
        System.out.println("----------");
        System.out.println(jumpGameII.jump(new int[]{4, 1, 1, 3, 1, 1, 1}));
        System.out.println("----------");
    }

    public int jump(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        int now = 0;
        int jump = 0;
        while (now < nums.length - 1) {
            if (now + nums[now] >= nums.length - 1) {
                jump++;
                return jump;
            }
            int nextIndex = 0;
            int maxRange = 0;
            for (int i = 1; i <= nums[now]; i++) {
                int nextRange = now + i + nums[now + i];
                if (nextRange >= maxRange) {
                    maxRange = nextRange;
                    nextIndex = now + i;
                }
            }
            now = nextIndex;
            jump++;
        }
        return jump;
    }

}
