package medium;

import utils.TreeNode;

public class InsertIntoBinarySearchTree {

    public static void main(String[] args) {

    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        insert(root, val, null);
        return root;
    }

    private void insert(TreeNode root, int val, TreeNode prevNode) {
        if (root != null) {
            if (root.val > val) {
                insert(root.left, val, root);
            } else {
                insert(root.right, val, root);
            }
        } else {
            root = new TreeNode(val);
            if (prevNode.val > val) {
                prevNode.left = root;
            } else {
                prevNode.right = root;
            }
        }
    }
}
