package learn.tree;

import utils.PrintUtils;
import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Postorder {

    public static void main(String[] args) {
        Postorder preOrder = new Postorder();
        preOrder.postorderTraversal(new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null)));
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> resultList = new ArrayList();
        travel(root, resultList);
        PrintUtils.printList(resultList);
        return resultList;
    }

    private void travel(TreeNode root, List<Integer> resultList) {
        if (root != null) {
            travel(root.left, resultList);
            travel(root.right, resultList);
            resultList.add(root.val);
        }
    }
}
