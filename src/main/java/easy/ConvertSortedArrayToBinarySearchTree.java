package easy;

import utils.TreeNode;

public class ConvertSortedArrayToBinarySearchTree {

    public static void main(String[] args) {

    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return build(0, nums.length - 1, nums);
    }

    private TreeNode build(int left, int right, int[] nums) {
        if (left <= right) {
            int mid = (right + left) / 2;
            TreeNode now = new TreeNode(nums[mid]);
            now.left = build(left, mid - 1, nums);
            now.right = build(mid + 1, right, nums);
            return now;
        }
        return null;
    }
}
