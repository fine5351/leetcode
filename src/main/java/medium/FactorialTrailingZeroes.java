package medium;

public class FactorialTrailingZeroes {

    public static void main(String[] args) {
        FactorialTrailingZeroes factorialTrailingZeroes = new FactorialTrailingZeroes();
        System.out.println(factorialTrailingZeroes.trailingZeroes(0));
        System.out.println(factorialTrailingZeroes.trailingZeroes(3));
        System.out.println(factorialTrailingZeroes.trailingZeroes(5));
        System.out.println(factorialTrailingZeroes.trailingZeroes(10));
        System.out.println(factorialTrailingZeroes.trailingZeroes(30));
    }

    public int trailingZeroes(int n) {
        int fiveCount = 0;
        for (int i = 0; i <= n; i += 5) {
            int temp = i;
            while (temp >= 5 && temp % 5 == 0) {
                temp = temp / 5;
                fiveCount++;
            }
        }
        return fiveCount;
    }

}
