package medium;

import utils.PrintUtils;
import utils.TreeNode;

public class ConvertBSTToGreaterTree {

    private int sum = 0;

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4, new TreeNode(1, new TreeNode(0), new TreeNode(2, null, new TreeNode(3))),
                new TreeNode(6, new TreeNode(5), new TreeNode(7, null, new TreeNode(8))));
        ConvertBSTToGreaterTree convertBSTToGreaterTree = new ConvertBSTToGreaterTree();
        convertBSTToGreaterTree.convertBST(root);
        PrintUtils.printTreePreorder(root);
    }

    public TreeNode convertBST(TreeNode root) {
        travel(root);
        return root;
    }

    private void travel(TreeNode root) {
        if (root != null) {
            convertBST(root.right);
            sum += root.val;
            root.val = sum;
            convertBST(root.left);
        }
    }
}
