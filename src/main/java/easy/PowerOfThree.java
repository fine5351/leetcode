package easy;

public class PowerOfThree {

    public static void main(String[] args) {

    }

    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        while (n > 1 && n % 3 == 0) {
            n = n / 3;
        }
        return n == 1;
    }
}
