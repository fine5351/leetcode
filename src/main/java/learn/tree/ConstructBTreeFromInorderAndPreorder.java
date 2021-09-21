package learn.tree;

import utils.PrintUtils;
import utils.TreeNode;

public class ConstructBTreeFromInorderAndPreorder {

    public static void main(String[] args) {
        ConstructBTreeFromInorderAndPreorder constructBTreeFromInorderAndPreorder = new ConstructBTreeFromInorderAndPreorder();
        TreeNode root = constructBTreeFromInorderAndPreorder.buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
        PrintUtils.printTreeInorder(root);
        PrintUtils.printTreePreorder(root);
    }

    public TreeNode buildTree(int[] inorder, int[] preorder) {
        return build(inorder, preorder, 0, inorder.length - 1, 0, preorder.length - 1);
    }

    private TreeNode build(int[] inorder, int[] preorder, int iLeft, int iRight, int pLeft, int pRight) {
        if (iLeft > iRight || pLeft > pRight) {
            return null;
        }
        TreeNode now = new TreeNode(preorder[pLeft]);
        int inorderNowIndex = searchInOrder(inorder, now.val);
        now.left = build(inorder, preorder, iLeft, inorderNowIndex - 1, pLeft + 1, inorderNowIndex - iLeft + pLeft);
        now.right = build(inorder, preorder, inorderNowIndex + 1, iRight, inorderNowIndex - iLeft + pLeft + 1, pRight);
        return now;
    }

    private int searchInOrder(int[] inorder, int target) {
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
