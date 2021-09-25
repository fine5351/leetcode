package medium;

import utils.PrintUtils;
import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BTreeZigzagLevelOrderTraversal {

    public static void main(String[] args) {
        BTreeZigzagLevelOrderTraversal bTreeZigzagLevelOrderTraversal = new BTreeZigzagLevelOrderTraversal();
        TreeNode root = TreeNode.buildTree(new Integer[]{3, 9, 20, 15, 7});
        List<List<Integer>> resultList = bTreeZigzagLevelOrderTraversal.zigzagLevelOrder(root);
        resultList.forEach(o -> PrintUtils.printList(o));
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> resultList = new ArrayList<>();
        travel(root, 0, resultList);
        return resultList;
    }

    private void travel(TreeNode root, int level, List<List<Integer>> resultList) {
        if (root == null) {
            return;
        } else {
            List<Integer> tempList = null;
            if (level >= resultList.size()) {
                tempList = new ArrayList<>();
                resultList.add(tempList);
            } else {
                tempList = resultList.get(level);
            }
            if (level % 2 == 0) {
                tempList.add(root.val);
            } else {
                tempList.add(0, root.val);
            }
            travel(root.left, level + 1, resultList);
            travel(root.right, level + 1, resultList);
        }
    }
}
