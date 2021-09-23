package easy;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        System.out.println(Arrays.toString(plusOne.plusOne(new int[]{1, 9, 9})));
        System.out.println(Arrays.toString(plusOne.plusOne(new int[]{9})));
    }

    public int[] plusOne(int[] digits) {
        int carry = 0;
        int i = digits.length - 1;
        int sum = digits[i] + carry + 1;
        digits[i] = sum % 10;
        carry = sum / 10;
        while (carry > 0 && i > 0) {
            i--;
            sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
        }
        if (carry > 0) {
            digits = Arrays.copyOf(digits, digits.length + 1);
            digits[0] = carry;
        }
        return digits;
    }

}
