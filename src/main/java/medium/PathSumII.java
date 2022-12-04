package medium;

import utils.PrintUtils;
import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {

    public static void main(String[] args) {
        PathSumII pathSumII = new PathSumII();
        List<List<Integer>> resultList = pathSumII.pathSum(new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(5, new TreeNode(6),
                        new TreeNode(7))), 6);
        resultList.forEach(o -> PrintUtils.printList(o));
        resultList = pathSumII.pathSum(new TreeNode(1, new TreeNode(2), null), 3);
        resultList.forEach(o -> PrintUtils.printList(o));
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> resultList = new ArrayList<>();
        travel(root, targetSum, new ArrayList<>(), resultList);
        resultList.forEach(o -> PrintUtils.printList(o));
        return new ArrayList<>();
    }

    private void travel(TreeNode root, int target, List<Integer> nodeList, List<List<Integer>> resultList) {
        if (root == null) {
            return;
        } else {
            nodeList.add(root.val);
            if (root.val == target && root.right == null && root.left == null) {
                resultList.add(new ArrayList<>(nodeList));
            }
            travel(root.left, target - root.val, nodeList, resultList);
            travel(root.right, target - root.val, nodeList, resultList);
            nodeList.remove(nodeList.size() - 1);
        }
    }
}
