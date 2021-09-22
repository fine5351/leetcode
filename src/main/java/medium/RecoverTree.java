package medium;

import utils.PrintUtils;
import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RecoverTree {

    private TreeNode first;

    private TreeNode second;

    public static void main(String[] args) {
        RecoverTree recoverTree = new RecoverTree();
        TreeNode root = new TreeNode(1, new TreeNode(3, null, new TreeNode(2)), null);
        recoverTree.recoverTree(root);
        PrintUtils.printTreeInorder(root);
    }

//    public void recoverTree(TreeNode root) {
//    }
//    private void preorderTravel(TreeNode root, List<TreeNode> nodeList, List<Integer> valList) {
//        if (root != null) {
//
//            preorderTravel(root.left, nodeList, valList);
//            preorderTravel(root.right, nodeList, valList);
//        }
//    }
    public void recoverTree(TreeNode root) {
        List<TreeNode> nodeList = new ArrayList<>();
        List<Integer> valList = new ArrayList<>();
        inorderTravel(root, nodeList, valList);
        valList = valList.stream().sorted().collect(Collectors.toList());
        for (int i = 0; i < nodeList.size(); i++) {
            nodeList.get(i).val = valList.get(i);
        }
    }

    private void inorderTravel(TreeNode root, List<TreeNode> nodeList, List<Integer> valList) {
        if (root != null) {
            inorderTravel(root.left, nodeList, valList);
            nodeList.add(root);
            valList.add(root.val);
            inorderTravel(root.right, nodeList, valList);
        }
    }

}
