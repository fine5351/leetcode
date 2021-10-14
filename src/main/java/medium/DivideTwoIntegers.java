package medium;

public class DivideTwoIntegers {

    public static void main(String[] args) {
        System.out.println(new DivideTwoIntegers().divide(2147483648L, -1));
        System.out.println(new DivideTwoIntegers().divide(10, -1));
        System.out.println(new DivideTwoIntegers().divide(10, 2));
        System.out.println(new DivideTwoIntegers().divide(10, 3));
        System.out.println(new DivideTwoIntegers().divide(10, 5));
        System.out.println(new DivideTwoIntegers().divide(10, 10));
        System.out.println(new DivideTwoIntegers().divide(-2147483648, -1));
    }

    public int divide(long dividend, long divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        long m = Math.abs(dividend);
        long n = Math.abs(divisor);
        boolean isPositive = !((dividend < 0) ^ (divisor < 0));
        long result = 0;
        if (n == 1) {
            return isPositive ? (int) m : (int) -m;
        }
        while (m >= n) {
            long temp = n;
            long times = 1;
            while (m >= (temp << 1)) {
                temp = temp << 1;
                times = times << 1;
            }
            result += times;
            m -= temp;
        }
        return isPositive ? (int) result : (int) -result;
    }
}
