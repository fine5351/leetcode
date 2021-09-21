package learn.tree;

import utils.TreeNode;

public class MaximumDepthOfBinaryTreeTopDown {

    private int maxDepth = 0;

    public static void main(String[] args) {
        MaximumDepthOfBinaryTreeTopDown maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTreeTopDown();
        System.out.println(maximumDepthOfBinaryTree.maxDepth(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
    }

    public int maxDepth(TreeNode root) {
        maxDepth = 0;
        backTrackByTopDown(root, 0);
        return maxDepth;
    }

    private void backTrackByTopDown(TreeNode root, int nowDepth) {
        if (root != null) {
            nowDepth++;
            maxDepth = Math.max(nowDepth, maxDepth);
            backTrackByTopDown(root.left, nowDepth);
            backTrackByTopDown(root.right, nowDepth);
        }
    }
}
