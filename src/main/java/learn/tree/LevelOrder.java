package learn.tree;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LevelOrder {

    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        backTrack(root, 0, result);
        return result;
    }

    private void backTrack(TreeNode root, int level, List<List<Integer>> result) {
        if (root != null) {
            List<Integer> list;
            if (level > result.size()) {
                list = new ArrayList<>();
                result.add(list);
            } else {
                list = result.get(level);
            }
            list.add(root.val);
            backTrack(root.left, level + 1, result);
            backTrack(root.right, level + 1, result);
        }
    }
}
