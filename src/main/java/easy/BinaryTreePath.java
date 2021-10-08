package easy;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePath {

    public static void main(String[] args) {

    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        travel(root, "", result);
        return result;
    }

    private void travel(TreeNode root, String output, List<String> result) {
        if (root != null) {
            output += root.val;
            if (root.left == null && root.right == null) {
                result.add(output);
            } else {
                output += "->";
                travel(root.left, output, result);
                travel(root.right, output, result);
            }
        }
    }
}
