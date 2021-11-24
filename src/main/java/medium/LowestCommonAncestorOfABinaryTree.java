package medium;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.TreeNode;

public class LowestCommonAncestorOfABinaryTree {

    private static final Logger logger = LoggerFactory.getLogger(LowestCommonAncestorOfABinaryTree.class);

    public static void main(String[] args) {
        LowestCommonAncestorOfABinaryTree lca = new LowestCommonAncestorOfABinaryTree();
        TreeNode p = new TreeNode(5);
        TreeNode q = new TreeNode(1);
        TreeNode root = new TreeNode(3, new TreeNode(5, new TreeNode(6), new TreeNode(2,
                new TreeNode(7), new TreeNode(4))),
                new TreeNode(1, new TreeNode(0), new TreeNode(8)));
        TreeNode lcaNode = lca.lowestCommonAncestor(root, p, q);
        System.out.println(lcaNode.val);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root.val == p.val || root.val == q.val) {
            return root;
        }
        TreeNode leftNode = lowestCommonAncestor(root.left, p, q);
        if (leftNode != null && leftNode.val != p.val && leftNode.val != q.val) {
            return leftNode;
        }
        TreeNode rightNode = lowestCommonAncestor(root.right, p, q);
        if (leftNode != null && rightNode != null) {
            return root;
        }
        return leftNode != null ? leftNode : rightNode;
    }

//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        TreeNode lastCanFind = root;
//        while (root != null) {
//            boolean leftCanFind = findTarget(root.left, p) && findTarget(root.left, q);
//            boolean rightCanFind = findTarget(root.right, p) && findTarget(root.right, q);
//            if (!leftCanFind && !rightCanFind) {
//                return root;
//            } else if (leftCanFind) {
//                lastCanFind = root;
//                root = root.left;
//            } else if (rightCanFind) {
//                lastCanFind = root;
//                root = root.right;
//            }
//        }
//        return lastCanFind;
//    }
//
//    private boolean findTarget(TreeNode root, TreeNode target) {
//        if (root != null) {
//            if (root.val == target.val) {
//                return true;
//            }
//            return findTarget(root.left, target) || findTarget(root.right, target);
//        }
//        return false;
//    }

}
