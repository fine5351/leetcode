package medium;

public class UniquePathsII {

    public static void main(String[] args) {
        UniquePathsII uniquePathsII = new UniquePathsII();
        System.out.println(uniquePathsII.uniquePathsWithObstacles(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));
        System.out.println("---------------------");
        System.out.println(uniquePathsII.uniquePathsWithObstacles(new int[][]{{0, 1}, {0, 0}}));
        System.out.println("---------------------");
        System.out.println(uniquePathsII.uniquePathsWithObstacles(new int[][]{{0, 1}, {0, 0}}));
        System.out.println("---------------------");
        System.out.println(uniquePathsII.uniquePathsWithObstacles(new int[][]{{0, 0}, {1, 1}, {0, 0}}));
        System.out.println("---------------------");
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1) {
            return 0;
        }
        int[][] matrix = new int[m][n];
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] != 1) {
                    matrix[i][j] = obstacleGrid[i][j];
                } else {
                    matrix[i][j] = -1;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            if (obstacleGrid[i][0] == 1) {
                break;
            } else {
                matrix[i][0] = 1;
            }
        }
        for (int i = 0; i < n; i++) {
            if (obstacleGrid[0][i] == 1) {
                break;
            } else {
                matrix[0][i] = 1;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ,");
            }
            System.out.println();
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] != -1) {
                    if (matrix[i][j] != -1) {
                        int up = matrix[i - 1][j] == -1 ? 0 : matrix[i - 1][j];
                        int left = matrix[i][j - 1] == -1 ? 0 : matrix[i][j - 1];
                        matrix[i][j] = up + left;
                    }
                }
            }
        }

        return matrix[m - 1][n - 1];
    }
}
