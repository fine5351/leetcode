package medium;

import utils.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class ConstructBTreeFromPreorderAndInorder {

    private Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return build(inorder, preorder, 0, inorder.length - 1, 0, preorder.length - 1);
    }

    private TreeNode build(int[] inorder, int[] preorder, int iLeft, int iRight, int pLeft, int pRight) {
        if (iLeft > iRight || pLeft > pRight) {
            return null;
        }
        TreeNode now = new TreeNode(preorder[pLeft]);
        int inorderNowIndex = map.get(now.val);
        now.left = build(inorder, preorder, iLeft, inorderNowIndex - 1, pLeft + 1, inorderNowIndex - iLeft + pLeft);
        now.right = build(inorder, preorder, inorderNowIndex + 1, iRight, inorderNowIndex - iLeft + pLeft + 1, pRight);
        return now;
    }

}
