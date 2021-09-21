package learn.tree;

import utils.TreeNode;

public class SymmetricTree {

    public static void main(String[] args) {
        SymmetricTree symmetricTree = new SymmetricTree();
        System.out.println(symmetricTree.isSymmetric(new TreeNode(1, new TreeNode(2, new TreeNode(2), null),
                new TreeNode(2, new TreeNode(2), null))));
        System.out.println(symmetricTree.isSymmetric(new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(4, new TreeNode(2),
                new TreeNode(3)))));
    }

    public boolean isSymmetric(TreeNode root) {
        return backTrack(root.left, root.right);
    }

    private boolean backTrack(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        return backTrack(left.left, right.right) && backTrack(left.right, right.left);

    }

}
