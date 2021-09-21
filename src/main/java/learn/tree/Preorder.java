package learn.tree;

import utils.PrintUtils;
import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Preorder {

    public static void main(String[] args) {
        Preorder preOrder = new Preorder();
        preOrder.preorderTraversal(new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null)));
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> resultList = new ArrayList();
        travel(root, resultList);
        PrintUtils.printList(resultList);
        return resultList;
    }

    private void travel(TreeNode root, List<Integer> resultList) {
        if (root != null) {
            resultList.add(root.val);
            travel(root.left, resultList);
            travel(root.right, resultList);
        }
    }
}
