package medium;

import java.util.Arrays;

public class BitwiseANDOfNumbersRange {

    public static void main(String[] args) {
        BitwiseANDOfNumbersRange bitwiseANDOfNumbersRange = new BitwiseANDOfNumbersRange();
        System.out.println(bitwiseANDOfNumbersRange.rangeBitwiseAnd(5, 7));
        System.out.println(bitwiseANDOfNumbersRange.rangeBitwiseAnd(3, 5));
        System.out.println(bitwiseANDOfNumbersRange.rangeBitwiseAnd(8, 15));
    }

    public int rangeBitwiseAnd(int left, int right) {
        int i = 0;
        while (left != right) {
            left = left >> 1;
            right = right >> 1;
            i++;
        }
        return left << i;
    }
}
