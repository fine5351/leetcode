package mdeium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ValidSudoku {

    public static void main(String[] args) {
        ValidSudoku validSudoku = new ValidSudoku();
        System.out.println(validSudoku.isValidSudoku(new char[][]{{'8', '3', '.', '.', '7', '.', '.', '.', '.'}, {
                '6', '.', '.', '1', '9', '5', '.', '.', '.'}, {'.', '9', '8', '.', '.', '.', '.', '6', '.'}, {
                '8', '.', '.', '.', '6', '.', '.', '.', '3'}, {'4', '.', '.', '8', '.', '3', '.', '.', '1'}, {
                '7', '.', '.', '.', '2', '.', '.', '.', '6'}, {'.', '6', '.', '.', '.', '.', '2', '8', '.'}, {
                '.', '.', '.', '4', '1', '9', '.', '.', '5'}, {'.', '.', '.', '.', '8', '.', '.', '7', '9'}}));
    }

    public boolean isValidSudoku(char[][] board) {
        List<Set<Character>> rowList = new ArrayList<>(9);
        List<Set<Character>> lineList = new ArrayList<>(9);
        List<Set<Character>> blockList = new ArrayList<>(9);
        initList(rowList);
        initList(lineList);
        initList(blockList);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                Character character = board[i][j];
                if ('.' == character) {
                    continue;
                }
                Set<Character> rowSet = rowList.get(i);
                if (rowSet.contains(character)) {
//                    System.out.println(i + " 行有誤 " + character);
                    return false;
                } else {
                    rowSet.add(character);
                }

                Set<Character> lineSet = lineList.get(j);
                if (lineSet.contains(character)) {
//                    System.out.println(j + " 列有誤 " + character);
                    return false;
                } else {
                    lineSet.add(character);
                }

                int block = 3 * (i / 3) + j / 3;
                Set<Character> blockSet = blockList.get(block);
                if (blockSet.contains(character)) {
//                    System.out.println(block + " 區塊有誤 " + character);
                    return false;
                } else {
                    blockSet.add(character);
                }
            }
        }
        return true;
    }

    private void initList(List<Set<Character>> list) {
        for (int i = 0; i < 9; i++) {
            list.add(new HashSet<>(9));
        }
    }

}
