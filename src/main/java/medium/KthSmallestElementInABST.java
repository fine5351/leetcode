package medium;

import utils.TreeNode;

public class KthSmallestElementInABST {

    public static void main(String[] args) {

    }

    private int count = 0;
    private int target = 0;

    public int kthSmallest(TreeNode root, int k) {
        travel(root, k);
        return target;
    }

    private void travel(TreeNode root, int k) {
        if (root != null) {
            travel(root.left, k);
            count++;
            if (count == k) {
                target = root.val;
            }
            travel(root.right, k);
        }
    }
}
