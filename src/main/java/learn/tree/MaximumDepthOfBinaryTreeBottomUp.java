package learn.tree;

import utils.TreeNode;

public class MaximumDepthOfBinaryTreeBottomUp {

    public static void main(String[] args) {
        MaximumDepthOfBinaryTreeBottomUp maximumDepthOfBinaryTreeBottomUp = new MaximumDepthOfBinaryTreeBottomUp();
        System.out.println(maximumDepthOfBinaryTreeBottomUp.maxDepth(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15),
                new TreeNode(7, new TreeNode(1), new TreeNode(12))))));
    }

    public int maxDepth(TreeNode root) {
        return backTrackByBottomUp(root);
    }

    private int backTrackByBottomUp(TreeNode root) {
        if (root != null) {
            return Math.max(backTrackByBottomUp(root.left), backTrackByBottomUp(root.right)) + 1;
        }
        return 0;
    }
}
