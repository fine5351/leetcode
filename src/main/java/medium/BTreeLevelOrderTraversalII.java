package medium;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BTreeLevelOrderTraversalII {

    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> resultList = new ArrayList<>();
        travel(root, 0, resultList);
        Collections.reverse(resultList);
        return resultList;
    }

    private void travel(TreeNode root, int level, List<List<Integer>> resultList) {
        if (root != null) {
            List<Integer> tempList;
            if (level >= resultList.size()) {
                tempList = new ArrayList<>();
                resultList.add(tempList);
            } else {
                tempList = resultList.get(level);
            }
            tempList.add(root.val);
            travel(root.left, level + 1, resultList);
            travel(root.right, level + 1, resultList);
        }
    }
}
