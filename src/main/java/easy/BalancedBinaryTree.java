package easy;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BalancedBinaryTree {

    public static void main(String[] args) {

    }

    public boolean isBalanced(TreeNode root) {
         return maxDepth(root, 0) != -1;
    }

    private int maxDepth(TreeNode root, int depth) {
        if (root != null) {
            depth++;
            int leftDepth = maxDepth(root.left, depth);
            int rightDepth = maxDepth(root.right, depth);
            if (leftDepth == -1 || rightDepth == -1 || Math.abs(leftDepth - rightDepth) > 1) {
                return -1;
            }
            return Math.max(leftDepth, rightDepth);
        }
        return depth;
    }

}
