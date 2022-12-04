package medium;

import java.util.Arrays;

public class SearchA2DMatrixII {

    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        SearchA2DMatrixII searchA2DMatrixII = new SearchA2DMatrixII();
        System.out.println(searchA2DMatrixII.searchMatrix(array, 27));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] <= target && matrix[i][matrix[i].length - 1] >= target) {
                if (Arrays.binarySearch(matrix[i], target) != -1) {
                    return true;
                }
            }
        }
        return false;
    }

    private int find(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
