package medium;

import utils.TreeNode;

public class CountCompleteTreeNode {

    public static void main(String[] args) {

    }

    public int countNodes(TreeNode root) {
        return travel(root, 0);
    }

    private int travel(TreeNode root, int count){
        if (root != null) {
            if (root.right != null) {
                return countNodes(root.left) + countNodes(root.right) + 1;
            } else {
                return countNodes(root.left) + 1;
            }
        } else {
            return 0;
        }
    }
}
