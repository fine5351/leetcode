package mdeium;

public class SearchA2DMatrix {

    public static void main(String[] args) {
        SearchA2DMatrix searchA2DMatrix = new SearchA2DMatrix();
        int[][] matrix = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        System.out.println(searchA2DMatrix.searchMatrix(matrix, 3));
        System.out.println("-------------------");
        System.out.println(searchA2DMatrix.searchMatrix(matrix, 13));
        System.out.println("-------------------");
        matrix = new int[][]{{1}};
        System.out.println(searchA2DMatrix.searchMatrix(matrix, 1));
        System.out.println("-------------------");
//        matrix = new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}};
//        searchA2DMatrix.searchMatrix(matrix);
//        searchA2DMatrix.printArray(matrix);
//        System.out.println("-------------------");
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        System.out.println("m : " + m + ", n : " + n);
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] <= target && target <= matrix[i][n - 1]) {
                return binarySearch(matrix[i], target) != -1;
            }
        }
        return false;
    }

    private int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int middle = arr[mid];
            System.out.println("left : " + left + ", right : " + right + ", mid : " + mid + ", [mid] : " + middle);
            if (middle == target) {
                return mid;
            } else if (middle < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

}
