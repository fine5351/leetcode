package medium;

public class PerfectSquares {

    public static void main(String[] args) {
        PerfectSquares perfectSquares = new PerfectSquares();
        System.out.println(perfectSquares.numSquares(12));
        System.out.println(perfectSquares.numSquares(4));
        System.out.println(perfectSquares.numSquares(10));
        System.out.println(perfectSquares.numSquares(7));
    }

    public int numSquares(int n) {
        while (n % 4 == 0) {
            n /= 4;
        }
        if (n % 8 == 7) {
            return 4;
        }
        for (int i = 0; i * i <= n; i++) {
            int sqrt = (int) Math.sqrt(n - i * i);
            if (i * i + sqrt * sqrt == n) {
                int result = 0;
                if (i > 0) {
                    result++;
                }
                if (sqrt > 0) {
                    result++;
                }
                return result;
            }
        }
        return 3;
    }
}
