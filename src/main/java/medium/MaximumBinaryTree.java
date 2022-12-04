package medium;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.PrintUtils;
import utils.TreeNode;

public class MaximumBinaryTree {

    private static final Logger logger = LoggerFactory.getLogger(MaximumBinaryTree.class);

    public static void main(String[] args) {
        MaximumBinaryTree maximumBinaryTree = new MaximumBinaryTree();
        TreeNode root = maximumBinaryTree.constructMaximumBinaryTree(new int[]{3, 2, 1, 6, 0, 5});
        PrintUtils.printTreePreorder(root);
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums, 0, nums.length - 1);
    }

    private TreeNode construct(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int maxIndex = -1;
        int maxValue = -1;
        for (int i = left; i <= right; i++) {
            if (maxValue < nums[i]) {
                maxIndex = i;
                maxValue = nums[i];
            }
        }
        TreeNode root = new TreeNode(maxValue);
        root.left = construct(nums, left, maxIndex - 1);
        root.right = construct(nums, maxIndex + 1, right);
        return root;
    }
//    public TreeNode constructMaximumBinaryTree(int[] nums) {
//        return construct(nums, 0, nums.length, new int[nums.length]);
//    }
//
//    private TreeNode construct(int[] nums, int left, int right, int[] isUsed) {
//        if (left >= right) {
//            return null;
//        }
//        int maxIndex = -1;
//        int maxValue = -1;
//        for (int i = left; i < right; i++) {
//            if (maxValue < nums[i]) {
//                maxIndex = i;
//                maxValue = nums[i];
//            }
//        }
//        if (isUsed[maxIndex] == 0) {
//            TreeNode root = new TreeNode(maxValue);
//            isUsed[maxIndex] = 1;
//            root.left = construct(nums, left, maxIndex, isUsed);
//            root.right = construct(nums, maxIndex + 1, right, isUsed);
//            return root;
//        } else {
//            return null;
//        }
//    }
}
