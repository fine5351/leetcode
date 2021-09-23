package medium;

import utils.PrintUtils;
import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BTreeLevelOrderTraversal {

    public static void main(String[] args) {
        BTreeLevelOrderTraversal bTreeLevelOrderTraversal = new BTreeLevelOrderTraversal();
        List<List<Integer>> resultList = bTreeLevelOrderTraversal.
                levelOrder(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15),
                        new TreeNode(7))));
        resultList.forEach(list -> PrintUtils.printList(list));

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> resultList = new ArrayList<>();
        levelTravel(root, 0, resultList);
        return resultList;
    }

    private void levelTravel(TreeNode root, int level, List<List<Integer>> resultList) {
        if (root != null) {
            List<Integer> list = null;
            if (level >= resultList.size()) {
                list = new ArrayList<>();
                resultList.add(list);
            } else {
                list = resultList.get(level);
            }
            list.add(root.val);
            levelTravel(root.left, level + 1, resultList);
            levelTravel(root.right, level + 1, resultList);
        }
    }

}
