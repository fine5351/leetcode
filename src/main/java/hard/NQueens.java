package hard;

import utils.PrintUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {

    public static void main(String[] args) {
        NQueens nQueens = new NQueens();
        List<List<String>> result = nQueens.solveNQueens(8);
        result.forEach(o -> {
            PrintUtils.printList(o);
        });

//        result = nQueens.solveNQueens(1);
//        result.forEach(o -> {
//            PrintUtils.printList(o);
//        });
//
//        result = nQueens.solveNQueens(1);
//        result.forEach(o -> {
//            PrintUtils.printList(o);
//        });
    }

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            Arrays.fill(board[i], '.');
        }
        List<List<String>> result = new ArrayList<>();
        backTrack(0, board, new ArrayList<>(), result);
        return result;
    }

    private void backTrack(int row, char[][] board, List<String> list, List<List<String>> result) {
        if (row == board.length) {
            result.add(new ArrayList<>(list));
        } else {
            for (int i = 0; i < board.length; i++) {
                board[row][i] = 'Q';
                if (isValid(row, i, board)) {
                    StringBuilder line = new StringBuilder();
                    for (int j = 0; j < board.length; j++) {
                        line.append(board[row][j]);
                    }
                    list.add(line.toString());
                    backTrack(row + 1, board, list, result);
                    list.remove(list.size() - 1);
                }
                board[row][i] = '.';
            }
        }
    }

    private boolean isValid(int row, int col, char[][] board) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (j == col && board[i][j] == 'Q') {
                    return false;
                }

                if (Math.abs(i - row) == Math.abs(j - col) && board[i][j] == 'Q') {
                    return false;
                }
            }
        }
        return true;
    }
}
