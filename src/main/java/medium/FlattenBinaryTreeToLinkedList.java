package medium;

import utils.PrintUtils;
import utils.TreeNode;

public class FlattenBinaryTreeToLinkedList {

    public static void main(String[] args) {
        FlattenBinaryTreeToLinkedList flattenBinaryTreeToLinkedList = new FlattenBinaryTreeToLinkedList();
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(6));
        flattenBinaryTreeToLinkedList.flatten(root);
        PrintUtils.printTreePreorder(root);
    }

    public void flatten(TreeNode root) {
        TreeNode cur = root;
        while (cur != null) {
            if (cur.left != null) {
                TreeNode temp = cur.left;
                while (temp.right != null) {
                    temp = temp.right;
                }
                temp.right = cur.right;
                cur.right = cur.left;
                cur.left = null;
            }
            cur = cur.right;
        }
    }

//    public void flatten(TreeNode root) {
//        List<TreeNode> list = new ArrayList<>();
//        preorderTravel(root, list);
//        for (int i = 0; i < list.size() - 1; i++) {
//            list.get(i).right = list.get(i + 1);
//            list.get(i).left = null;
//        }
//    }
//
//    private void preorderTravel(TreeNode root, List<TreeNode> list) {
//        if (root != null) {
//            list.add(root);
//            preorderTravel(root.left, list);
//            preorderTravel(root.right, list);
//        }
//    }
}
