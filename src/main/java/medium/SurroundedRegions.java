package medium;

import utils.PrintUtils;

import java.util.ArrayList;
import java.util.List;

public class SurroundedRegions {

    public static void main(String[] args) {
        SurroundedRegions surroundedRegions = new SurroundedRegions();
        surroundedRegions.solve(new char[][]{{'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'X'}});
        surroundedRegions.solve(new char[][]{{'X', 'O', 'X'}, {'X', 'O', 'X'}, {'X', 'O', 'X'}});
        surroundedRegions.solve(new char[][]{{'O'}});
        surroundedRegions.solve(new char[][]{{'O', 'O'}, {'O', 'O'}});
    }

    public void solve(char[][] board) {
        if (board.length > 1) {
            int m = board.length;
            int n = board[0].length;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if ((i == 0 || i == m - 1 || j == 0 | j == n - 1) && board[i][j] == 'O') {
                        board[i][j] = 'G';
                        dfs(i, j, i + 1, j, board);
                        dfs(i, j, i, j + 1, board);
                        dfs(i, j, i - 1, j, board);
                        dfs(i, j, i, j - 1, board);
                    }
                }
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (board[i][j] == 'O') {
                        board[i][j] = 'X';
                    }
                    if (board[i][j] == 'G') {
                        board[i][j] = 'O';
                    }
                }
            }
        }
        PrintUtils.print2DArray(board);
    }

    private void dfs(int prevX, int prevY, int x, int y, char[][] board) {
        if (x >= 0 && x < board.length && y >= 0 && y < board[0].length && board[x][y] == 'O') {
            board[x][y] = 'G';
            if (x + 1 != prevX) {
                dfs(x, y, x + 1, y, board);
            }
            if (x - 1 != prevX) {
                dfs(x, y, x - 1, y, board);
            }
            if (y + 1 != prevY) {
                dfs(x, y, x, y + 1, board);
            }
            if (y - 1 != prevY) {
                dfs(x, y, x, y - 1, board);
            }
        }
    }

}
