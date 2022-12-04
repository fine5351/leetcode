package medium;

public class RangeSumQuery2DImmutable {

    public static void main(String[] args) {
        RangeSumQuery2DImmutable rangeSumQuery2DImmutable = new RangeSumQuery2DImmutable();
        NumMatrix numMatrix = new NumMatrix(new int[][]{{3, 0, 1, 4, 2}, {5, 6, 3, 2, 1}, {1, 2, 0, 1, 5}, {4, 1, 0, 1, 7}, {1,
                0, 3, 0, 5}});
        System.out.println(numMatrix.sumRegion(2, 1, 4, 3));
        System.out.println(numMatrix.sumRegion(1, 1, 2, 2));
        System.out.println(numMatrix.sumRegion(1, 2, 2, 4));
    }

    public static class NumMatrix {
        private int[][] dp;

        public NumMatrix(int[][] matrix) {
            dp = new int[matrix.length + 1][matrix[0].length + 1];

            for (int i = 1; i <= matrix.length; i++) {
                for (int j = 1; j <= matrix[0].length; j++) {
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j] - dp[i - 1][j - 1] + matrix[i - 1][j - 1];
                }
            }
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            return dp[row2 + 1][col2 + 1] - dp[row1][col2 + 1] - dp[row2 + 1][col1] + dp[row1][col1];
        }
//        public NumMatrix(int[][] matrix) {
//            dp = new int[matrix.length][matrix[0].length];
//            dp[0][0] = matrix[0][0];
//
//            for (int i = 0; i < matrix.length; i++) {
//                for (int j = 0; j < matrix[i].length; j++) {
//                    if (j == 0) {
//                        dp[i][j] = matrix[i][j];
//                    } else if (i == 0) {
//                        dp[i][j] = dp[i][j - 1] + matrix[i][j];
//                    } else {
//                        dp[i][j] = dp[i][j - 1] + matrix[i][j];
//                    }
//                }
//            }
//        }
//
//        public int sumRegion(int row1, int col1, int row2, int col2) {
//            int sum = 0;
//            for (int i = row1; i <= row2; i++) {
//                sum += col1 >= 1 ? dp[i][col2] - dp[i][col1 - 1] : dp[i][col2];
//            }
//            return sum;
//        }
    }

}
