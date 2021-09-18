package mdeium;

import java.util.List;

public class WordSearch {

    public static void main(String[] args) {
        WordSearch wordSearch = new WordSearch();
        System.out.println(wordSearch.exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCCED"));
        System.out.println("-----------------------------------");
        System.out.println(wordSearch.exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "SEE"));
        System.out.println("-----------------------------------");
        System.out.println(wordSearch.exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCB"));
        System.out.println("-----------------------------------");
        System.out.println(wordSearch.exist(new char[][]{{'A', 'A'}}, "AA"));
        System.out.println("-----------------------------------");
        System.out.println(wordSearch.exist(new char[][]{{'A', 'A', 'A', 'A', 'A'}, {'A', 'A', 'A', 'A', 'A'},
                {'A', 'A', 'A', 'A', 'A'}, {'A', 'A', 'A', 'A', 'A'}, {'A', 'A', 'A', 'A', 'A'}}, "AAAAAAAAAAAAAAB"));
        System.out.println("-----------------------------------");
    }

    public boolean exist(char[][] board, String word) {
        if (board.length == 0) {
            return false;
        } else if (board.length == 1 && board[0].length == 1) {
            return String.valueOf(board[0][0]).equals(word);
        }
        int m = board.length;
        int n = board[0].length;
        char[] words = word.toCharArray();
        int[][] directs = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (backTrack(0, i, j, board, words, directs)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean backTrack(int step, int nowX, int nowY, char[][] board, char[] words, int[][] directs) {
        char thisChar = board[nowX][nowY];
        if (words[step] != thisChar) {
            return false;
        } else if (step == words.length - 1) {
            return true;
        } else {
            board[nowX][nowY] = '#';
            for (int i = 0; i < directs.length; i++) {
                int nextX = nowX + directs[i][0];
                int nextY = nowY + directs[i][1];
                if (isBoundry(nextX, nextY, board) && board[nextX][nextY] == words[step + 1]) {
                    if (!backTrack(step + 1, nextX, nextY, board, words, directs)) {
                        continue;
                    } else {
                        return true;
                    }
                }
            }
            board[nowX][nowY] = thisChar;
        }
        return false;
    }
//    public boolean exist(char[][] board, String word) {
//        if (board.length == 0) {
//            return false;
//        } else if (board.length == 1 && board[0].length == 1) {
//            return String.valueOf(board[0][0]).equals(word);
//        }
//        int m = board.length;
//        int n = board[0].length;
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (backTrack(i, j, board, new StringBuilder(word))) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//    private boolean backTrack(int nowX, int nowY, char[][] board, StringBuilder remaining) {
//        char thisChar = board[nowX][nowY];
//        System.out.println("now : " + thisChar + ", remaining : " + remaining.toString());
//        int[][] directs = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
//        if(remaining.charAt(0) != thisChar){
//            return false;
//        }
//        else if (remaining.length() == 1) {
//            return true;
//        } else {
//            remaining.deleteCharAt(0);
//            board[nowX][nowY] = '#';
//            for (int i = 0; i < directs.length; i++) {
//                int nextX = nowX + directs[i][0];
//                int nextY = nowY + directs[i][1];
//                if (isBoundry(nextX, nextY, board) && board[nextX][nextY] != '#' && board[nextX][nextY] == remaining.charAt(0)) {
//                    if (!backTrack(nextX, nextY, board, remaining)) {
//                        continue;
//                    } else {
//                        return true;
//                    }
//                }
//            }
//            remaining.insert(0, thisChar);
//            board[nowX][nowY] = thisChar;
//        }
//        return false;
//    }

    private boolean isBoundry(int nextX, int nextY, char[][] board) {
        return nextX >= 0 && nextX < board.length && nextY >= 0 && nextY < board[nextX].length;
    }
}
