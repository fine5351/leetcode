package medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static void main(String[] args) {
        SpiralMatrix spiralMatrix = new SpiralMatrix();
//        spiralMatrix.spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}).forEach(o -> {
//            System.out.print(o + ",");
//        });
//        System.out.println();
//        System.out.println("--------------");
        spiralMatrix.spiralOrder(new int[][]{{2, 3, 4}, {5, 6, 7}, {8, 9, 10}, {11, 12, 13}}).forEach(o -> {
            System.out.print(o + ",");
        });
        System.out.println();
        System.out.println("--------------");
        spiralMatrix.spiralOrder(new int[][]{{3}, {2}}).forEach(o -> {
            System.out.print(o + ",");
        });
        System.out.println();
        System.out.println("--------------");
        spiralMatrix.spiralOrder(new int[][]{{2, 5}, {8, 4}, {0, -1}}).forEach(o -> {
            System.out.print(o + ",");
        });
        System.out.println();
        System.out.println("--------------");
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        boolean[][] isVisited = new boolean[matrix.length][matrix[0].length];
        int i = 0;
        int j = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int halfM = m % 2 == 0 ? m / 2 : m / 2 + 1;
        int halfN = n / 2;
        System.out.println("m : " + m + ", n : " + n);
        boolean isXAxis = true;
        List<Integer> resultList = new ArrayList<>();
        resultList.add(matrix[0][0]);
        isVisited[0][0] = true;
        while (resultList.size() < m * n) {
            if (isXAxis) {
                if (i < halfM) {
                    if (j == n - 1 || isVisited[i][j + 1]) {
                        isXAxis = false;
                    } else {
                        j++;
                    }
                } else {
                    if (j == 0 || isVisited[i][j - 1]) {
                        isXAxis = false;
                    } else {
                        j--;
                    }
                }
            } else {
                if (j < halfN && n > 1) {
                    if (i == 0 || isVisited[i - 1][j]) {
                        isXAxis = true;
                    } else {
                        i--;
                    }
                } else {
                    if (i == m - 1 || isVisited[i + 1][j]) {
                        isXAxis = true;
                    } else {
                        i++;
                    }
                }
            }
            if (!isVisited[i][j]) {
                System.out.println("i : " + i + ", j : " + j);
                resultList.add(matrix[i][j]);
                isVisited[i][j] = true;
            }
        }
        return resultList;
    }
}
