package medium;

import java.util.Map;

public class SpiralMatrixII {

    private String itemId;

    private String itemName;

    private Map<String, Boolean> functionEnableMap;

    public static void main(String[] args) {
        SpiralMatrixII spiralMatrixII = new SpiralMatrixII();
        spiralMatrixII.generateMatrix(6);
    }

    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        boolean[][] isVisited = new boolean[n][n];
        int halfM = n % 2 == 0 ? n / 2 : n / 2 + 1;
        int halfN = n / 2;
        int notFilledCount = n * n;
        int nowNum = 1;
        int i = 0;
        int j = 0;
        boolean isXAxis = true;
        result[0][0] = nowNum;
        isVisited[0][0] = true;
        while (nowNum < notFilledCount) {
            if (isXAxis) {
                if (i < halfM) {
                    if (j + 1 == n || isVisited[i][j + 1]) {
                        isXAxis = false;
                    } else {
                        j++;
                        nowNum++;
                        result[i][j] = nowNum;
                        isVisited[i][j] = true;
                    }
                } else {
                    if (j - 1 < 0 || isVisited[i][j - 1]) {
                        isXAxis = false;
                    } else {
                        j--;
                        nowNum++;
                        result[i][j] = nowNum;
                        isVisited[i][j] = true;
                    }
                }
            } else {
                if (j < halfN) {
                    if (i - 1 < 0 || isVisited[i - 1][j]) {
                        isXAxis = true;
                    } else {
                        i--;
                        nowNum++;
                        result[i][j] = nowNum;
                        isVisited[i][j] = true;
                    }
                } else {
                    if (i + 1 == n || isVisited[i + 1][j]) {
                        isXAxis = true;
                    } else {
                        i++;
                        nowNum++;
                        result[i][j] = nowNum;
                        isVisited[i][j] = true;
                    }
                }
            }
        }

        for (int k = 0; k < n; k++) {
            for (int l = 0; l < n; l++) {
                System.out.print(result[k][l] + ", ");
            }
            System.out.println();
        }

        return result;
    }


}
