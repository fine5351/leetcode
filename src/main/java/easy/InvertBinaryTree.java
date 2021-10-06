package easy;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InvertBinaryTree {

    public static void main(String[] args) {

    }

    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
    }

}
