package easy;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class MinimumDepthOfBinaryTree {

    public static void main(String[] args) {

    }

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftDepth = minDepth(root.left);
            int rightDepth = minDepth(root.right);
            if (leftDepth == 0 || rightDepth == 0) {
                return leftDepth + rightDepth + 1;
            } else {
                return Math.min(leftDepth, rightDepth);
            }
        }
    }

//    public int minDepth(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//        List<Integer> depthList = new ArrayList<>();
//        travel(root, 1, depthList);
//        depthList.sort((o1, o2) -> o1 - o2);
//        return depthList.get(0);
//    }
//
//    private void travel(TreeNode root, int depth, List<Integer> depthList) {
//        if (root != null && root.left == null && root.right == null) {
//            depthList.add(depth);
//            return;
//        } else {
//            depth++;
//            travel(root.left, depth, depthList);
//            travel(root.right, depth, depthList);
//        }
//    }
}
