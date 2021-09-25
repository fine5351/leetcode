package easy;

import utils.TreeNode;

public class SameTree {

    public static void main(String[] args) {
        SameTree sameTree = new SameTree();
        sameTree.isSameTree(new TreeNode(1, new TreeNode(2), new TreeNode(3)), new TreeNode(1, new TreeNode(2), new TreeNode(3)));
        sameTree.isSameTree(new TreeNode(1, new TreeNode(2), null), new TreeNode(1, null, new TreeNode(2)));

    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        StringBuilder pathP = new StringBuilder();
        StringBuilder pathQ = new StringBuilder();
        preorderTravel(p, pathP);
        preorderTravel(q, pathQ);
        System.out.println(pathP + ", " + pathQ);
        return pathP.toString().equals(pathQ.toString());
    }

    private void preorderTravel(TreeNode root, StringBuilder pathBuilder) {
        if (root != null) {
            pathBuilder.append(root.val);
            preorderTravel(root.left, pathBuilder);
            preorderTravel(root.right, pathBuilder);
        }
        else{
            pathBuilder.append("null");
        }
    }
}
