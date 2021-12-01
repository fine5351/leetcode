package medium;

import utils.PrintUtils;

public class GameOfLife {

    public static void main(String[] args) {
        GameOfLife gameOfLife = new GameOfLife();
        int[][] board = new int[][]{{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}};
        gameOfLife.gameOfLife(board);
        PrintUtils.print2DArray(board);

        board = new int[][]{{1, 1}, {1, 0}};
        gameOfLife.gameOfLife(board);
        PrintUtils.print2DArray(board);
    }

    public void gameOfLife(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int liveCount = getLiveCount(i, j, board);
                if (board[i][j] == 0) {
                    if (liveCount == 3) {
                        board[i][j] = 3;
                    }
                } else {
                    if (liveCount < 2 || liveCount > 3) {
                        board[i][j] = 2;
                    }
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = board[i][j] % 2;
            }
        }
    }

    private int getLiveCount(int x, int y, int[][] board) {
        int count = 0;
        for (int i = x - 1; i < x + 2; i++) {
            for (int j = y - 1; j < y + 2; j++) {
                if (i >= 0 && i < board.length && j >= 0 && j < board[i].length && !(i == x && j == y)) {
                    if (1 == board[i][j] || 2 == board[i][j]) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
