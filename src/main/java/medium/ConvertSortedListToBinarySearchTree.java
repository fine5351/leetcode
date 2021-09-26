package medium;

import utils.ListNode;
import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class ConvertSortedListToBinarySearchTree {

    public static void main(String[] args) {

    }

    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return build(0, list.size(), list);
    }

    private TreeNode build(int left, int right, List<Integer> list) {
        if (left > right) {
            return null;
        } else {
            int mid = (right + left) / 2;
            TreeNode now = new TreeNode(list.get(mid));
            now.left = build(left, mid - 1, list);
            now.right = build(mid + 1, right, list);
            return now;
        }
    }

//    public TreeNode sortedListToBST(ListNode head) {
//        List<Integer> list = new ArrayList<>();
//        while (head != null) {
//            list.add(head.val);
//            head = head.next;
//        }
//        return build(0, list.size(), list);
//    }
//
//    private TreeNode build(int left, int right, List<Integer> list) {
//        if (left > right) {
//            return null;
//        } else {
//            int mid = (right + left) / 2;
//            TreeNode now = new TreeNode(list.get(mid));
//            now.left = build(left, mid - 1, list);
//            now.right = build(mid + 1, right, list);
//            return now;
//        }
//    }
}
