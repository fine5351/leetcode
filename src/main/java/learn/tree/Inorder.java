package learn.tree;

import utils.PrintUtils;
import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Inorder {

    public static void main(String[] args) {
        Inorder preOrder = new Inorder();
        preOrder.inorderTraversal(new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null)));
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> resultList = new ArrayList();
        travel(root, resultList);
        PrintUtils.printList(resultList);
        return resultList;
    }

    private void travel(TreeNode root, List<Integer> resultList) {
        if (root != null) {
            travel(root.left, resultList);
            resultList.add(root.val);
            travel(root.right, resultList);
        }
    }
}
