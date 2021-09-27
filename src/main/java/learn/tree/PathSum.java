package learn.tree;

import utils.TreeNode;

public class PathSum {

    public static void main(String[] args) {
        PathSum pathSum = new PathSum();
        Integer[] array = new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1};
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return backTrack(root, 0, targetSum);
    }

    private boolean backTrack(TreeNode root, int nowSum, int targetSum) {
        if (root != null) {
            nowSum += root.val;
            if (root.left == null && root.right == null) {
                return nowSum == targetSum;
            }
            return backTrack(root.left, nowSum, targetSum) || backTrack(root.right, nowSum, targetSum);
        }
        return false;
    }
}
