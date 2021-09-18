package easy;

public class ReverseInteger {

    public static void main(String[] args) {

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
