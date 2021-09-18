package easy;

public class PalindromeNumber {

    public static void main(String[] args) {

    }

    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        return x == reverse(x);
    }

    public int reverse(int x) {
        long input = x;
        boolean isPositive = input > 0;
        input = isPositive ? input : -1 * input;
        long output = 0;
        while (input > 0) {
            output *= 10;
            output += input % 10;
            input /= 10;
        }
        output = isPositive ? output : -1 * output;
        if (output > Integer.MAX_VALUE || output < Integer.MIN_VALUE) {
            output = 0;
        }
        return (int) output;
    }
}
