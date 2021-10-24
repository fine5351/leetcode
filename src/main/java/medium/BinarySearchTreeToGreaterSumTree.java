package medium;

import utils.TreeNode;

public class BinarySearchTreeToGreaterSumTree {

    public static void main(String[] args) {

    }

    private int sum = 0;

    public TreeNode bstToGst(TreeNode root) {
        travel(root);
        return root;
    }

    private void travel(TreeNode root) {
        if (root != null) {
            travel(root.right);
            sum += root.val;
            root.val = sum;
            travel(root.left);
        }
    }
}
