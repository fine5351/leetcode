package utils;

public class Node {

    public int val;

    public Node left;

    public Node right;

    public Node next;

    public Node() {
    }

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static Node buildTree(Integer[] nums) {
        return build(nums, 0, nums.length - 1);
    }

    private static Node build(Integer[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;
        Node now = new Node(nums[mid]);
        now.left = build(nums, left, mid - 1);
        now.right = build(nums, mid + 1, right);
        return now;
    }

}
