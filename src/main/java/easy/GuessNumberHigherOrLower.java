package easy;

public class GuessNumberHigherOrLower {

    public static void main(String[] args) {

    }

    public int guessNumber(int n) {
        int result = guess(n);
        if (result == 0) {
            return n;
        } else {
            int left = 1;
            int right = n;
            while (left < right) {
                int mid = left + (right - left) / 2;
                result = guess(mid);
                if (result == 1) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            return left;
        }
    }

    int guess(int num) {
        return 0;
    }
}
