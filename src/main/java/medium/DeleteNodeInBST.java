package medium;

import utils.TreeNode;

public class DeleteNodeInBST {

    public static void main(String[] args) {

    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root != null) {
            if (key == root.val) {
                if (root.left == null) {
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                } else {
                    TreeNode minNode = getMin(root.right);
                    root.val = minNode.val;
                    root.right = deleteNode(root.right, minNode.val);
                }
            } else if (key > root.val) {
                root.right = deleteNode(root.right, key);
            } else if (key < root.val) {
                root.left = deleteNode(root.left, key);
            }
            return root;
        }
        return null;
    }

    private TreeNode getMin(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

}
