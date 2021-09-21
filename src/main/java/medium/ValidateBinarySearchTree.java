package medium;

import utils.TreeNode;

public class ValidateBinarySearchTree {

    public static void main(String[] args) {
        ValidateBinarySearchTree validateBinarySearchTree = new ValidateBinarySearchTree();
        System.out.println(validateBinarySearchTree.isValidBST(new TreeNode(2, new TreeNode(1), new TreeNode(3))));
        System.out.println("---------------------------------");
        System.out.println(validateBinarySearchTree.isValidBST(new TreeNode(5, new TreeNode(1), new TreeNode(4, new TreeNode(3), new TreeNode(6)))));
        System.out.println("---------------------------------");
        System.out.println(validateBinarySearchTree.isValidBST(new TreeNode(0)));
        System.out.println("---------------------------------");
        System.out.println(validateBinarySearchTree.isValidBST(new TreeNode(5, new TreeNode(4), new TreeNode(6, new TreeNode(3), new TreeNode(7)))));
        System.out.println("---------------------------------");
    }

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode root, long min, long max) {
        if (root != null) {
            System.out.println("min : " + min + ",  root : " + root.val + ", max : " + max);
            if (root.val > min && root.val < max) {
                return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
            } else {
                return false;
            }
        }
        System.out.println("is End");
        return true;
    }
}
