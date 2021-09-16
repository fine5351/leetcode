package mdeium;

import java.util.ArrayList;
import java.util.List;

public class SetMatrixZeroes {

    public static void main(String[] args) {
        SetMatrixZeroes setMatrixZeroes = new SetMatrixZeroes();
        int[][] matrix = new int[][]{{1,1,1},{1,0,1},{1,1,1}};
        setMatrixZeroes.setZeroes(matrix);
        setMatrixZeroes.printArray(matrix);
        System.out.println("-------------------");
        matrix = new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setMatrixZeroes.setZeroes(matrix);
        setMatrixZeroes.printArray(matrix);
        System.out.println("-------------------");
    }

    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<int[]> zeroPointList = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (0 == matrix[i][j]) {
                    zeroPointList.add(new int[]{i, j});
                }
            }
        }

        for (int i = 0; i < zeroPointList.size(); i++) {
            int[] point = zeroPointList.get(i);
            int x = point[0];
            int y = point[1];

            for (int j = 0; j < n; j++) {
                matrix[x][j] = 0;
            }

            for (int j = 0; j < m; j++) {
                matrix[j][y] = 0;
            }
        }
    }

    private void printArray(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
