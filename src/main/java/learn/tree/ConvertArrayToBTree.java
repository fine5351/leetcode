package learn.tree;

import utils.PrintUtils;
import utils.TreeNode;

import java.util.Arrays;

public class ConvertArrayToBTree {

    public static void main(String[] args) {
        ConvertArrayToBTree convertArrayToBTree = new ConvertArrayToBTree();
        TreeNode root = convertArrayToBTree.buildTree(new int[]{1, 2, 3});
        PrintUtils.printTreePreorder(root);
        PrintUtils.printTreeInorder(root);
        PrintUtils.printTreePostOrder(root);
    }

    private static TreeNode buildTree(int[] array) {
        Arrays.sort(array);
        return build(array, 0, array.length - 1);
    }

    private static TreeNode build(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode now = new TreeNode(nums[mid]);
        now.left = build(nums, left, mid - 1);
        now.right = build(nums, mid + 1, right);
        return now;
    }
}
