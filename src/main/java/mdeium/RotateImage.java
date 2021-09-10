package mdeium;

public class RotateImage {

    public static void main(String[] args) {
        RotateImage rotateImage = new RotateImage();
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotateImage.rotate(matrix);
    }

    public void rotate(int[][] matrix) {
        diagonalRotate(matrix);
        xAxisRotate(matrix);
    }

    private void diagonalRotate(int[][] matrix) {
        int n = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i + j < n) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[n - j][n - i];
                    matrix[n - j][n - i] = temp;
                }
            }
        }
    }

    private void xAxisRotate(int[][] matrix) {
        int n = matrix.length - 1;
        int half = matrix.length / 2;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i < half) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[n - i][j];
                    matrix[n - i][j] = temp;
                }
            }
        }
    }

    private void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + ",");
            }
            System.out.println();
        }
    }

}
