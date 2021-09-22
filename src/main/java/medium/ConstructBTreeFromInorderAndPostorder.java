package medium;

import utils.PrintUtils;
import utils.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class ConstructBTreeFromInorderAndPostorder {

    private Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        ConstructBTreeFromInorderAndPostorder constructBTreeFromInorderAndPostorder = new ConstructBTreeFromInorderAndPostorder();
        TreeNode root = constructBTreeFromInorderAndPostorder.buildTree(new int[]{9, 3, 15, 20, 7}, new int[]{9, 15, 7, 20, 3});
        PrintUtils.printTreePreorder(root);
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return build(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1);
    }

    private TreeNode build(int[] inorder, int[] postorder, int iLeft, int iRight, int pLeft, int pRight) {
        System.out.println("iLeft : " + iLeft + ", iRight : " + iRight + ", pLeft : " + pLeft + ", pRight : " + pRight);
        if (iLeft > iRight || pLeft > pRight) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[pRight]);
        int inorderIndex = map.get(root.val);
        System.out.println("root val : " + root.val + " ,index : " + inorderIndex);
        root.left = build(inorder, postorder, iLeft, inorderIndex - 1, pLeft, inorderIndex - 1 - iLeft + pLeft);
        root.right = build(inorder, postorder, inorderIndex + 1, iRight, pRight - iRight + inorderIndex, pRight - 1);
        return root;
    }
}
