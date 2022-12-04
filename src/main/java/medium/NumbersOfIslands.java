package medium;

public class NumbersOfIslands {

    public static void main(String[] args) {
        NumbersOfIslands numbersOfIslands = new NumbersOfIslands();
//        char[][] grid = new char[][]{{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}};
//        System.out.println(numbersOfIslands.numIslands(grid));
//        grid = new char[][]{{'1', '1', '0', '0', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '1', '0', '0'}, {'0', '0', '0', '1', '1'}};
//        System.out.println(numbersOfIslands.numIslands(grid));
        char[][] grid = new char[][]{{'1', '1', '1'}, {'0', '1', '0'}, {'1', '1', '1'}};
        System.out.println(numbersOfIslands.numIslands(grid));
    }

    public int numIslands(char[][] grid) {
        int nums = 0;
        boolean[][] isVisited = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1' && !isVisited[i][j]) {
                    travel(i, j, grid, isVisited);
                    nums++;
                    System.out.println("nums : " + nums);
                }
            }
        }

        return nums;
    }

    private void travel(int x, int y, char[][] grid, boolean[][] isVisited) {
        if (x >= grid.length || y >= grid[x].length) {
            return;
        } else if (grid[x][y] == '1') {
            isVisited[x][y] = true;
            int up = y - 1;
            int down = y + 1;
            int left = x - 1;
            int right = x + 1;
            if (up >= 0 && !isVisited[x][up]) {
                travel(x, up, grid, isVisited);
            }
            if (down < grid[x].length && !isVisited[x][down]) {
                travel(x, down, grid, isVisited);
            }
            if (left >= 0 && !isVisited[left][y]) {
                travel(left, y, grid, isVisited);
            }
            if (right < grid.length && !isVisited[right][y]) {
                travel(right, y, grid, isVisited);
            }
        }
    }

}
