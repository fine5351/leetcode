package mdeium;

public class MinimumPathSum {

    public static void main(String[] args) {
        MinimumPathSum minimumPathSum = new MinimumPathSum();
        System.out.println(minimumPathSum.minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
        System.out.println("-------------------");
        System.out.println(minimumPathSum.minPathSum(new int[][]{{1, 2, 3}, {4, 5, 6}}));
        System.out.println("-------------------");
    }

    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    if (j == 0) {
                        matrix[i][j] = grid[i][j];
                    } else {
                        matrix[i][j] = grid[i][j] + matrix[i][j - 1];
                    }
                    continue;
                }
                if (j == 0) {
                    matrix[i][j] = grid[i][j] + matrix[i-1][j];
                    continue;
                }
                int sumFromLeft = grid[i][j];
                int sumFromTop = grid[i][j];
                sumFromLeft += matrix[i][j - 1];
                sumFromTop += matrix[i - 1][j];
                matrix[i][j] = Math.min(sumFromTop, sumFromLeft);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ,");
            }
            System.out.println();
        }
        return matrix[m - 1][n - 1];
    }
}
