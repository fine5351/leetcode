package easy;

import java.util.Arrays;

public class CountingBits {

    public static void main(String[] args) {
        CountingBits countingBits = new CountingBits();
//        System.out.println(Arrays.toString(countingBits.countBits(2)));
        System.out.println(Arrays.toString(countingBits.countBits(5)));
    }

    public int[] countBits(int n) {
        if (n == 0) {
            return new int[]{0};
        }
        int[] ans = new int[n + 1];
        ans[0] = 0;
        ans[1] = 1;
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                ans[i] = ans[i / 2];
            } else {
                ans[i] = ans[i - 1] + 1;
            }
        }
        return ans;
    }
}
