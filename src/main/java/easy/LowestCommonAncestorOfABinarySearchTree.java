package easy;

import utils.TreeNode;

public class LowestCommonAncestorOfABinarySearchTree {

    public static void main(String[] args) {

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root != null) {
            if (root.val < Math.min(p.val, q.val)) {
                return lowestCommonAncestor(root.right, p, q);
            } else if (root.val > Math.max(p.val, q.val)) {
                return lowestCommonAncestor(root.left, p, q);
            } else {
                return root;
            }
        }
        return null;
    }

}
