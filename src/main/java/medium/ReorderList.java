package medium;

import utils.ListNode;
import utils.PrintUtils;

import java.util.ArrayList;
import java.util.List;

public class ReorderList {

    public static void main(String[] args) {
        ReorderList reorderList = new ReorderList();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        reorderList.reorderList(head);
        PrintUtils.printListNode(head);
        head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        reorderList.reorderList(head);
        PrintUtils.printListNode(head);
    }

    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null) {
            fast = fast.next;
            if (fast == null) {
                break;
            }
            fast = fast.next;
            slow = slow.next;
        }

        ListNode half = slow.next;
        slow.next = null;

        half = reverse(half);

        ListNode cur = head;
        while (half != null) {
            ListNode tempA = cur.next;
            ListNode tempB = half.next;
            cur.next = half;
            half.next = tempA;
            cur = tempA;
            half = tempB;
        }
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

//    public void reorderList(ListNode head) {
//        List<ListNode> list = new ArrayList<>();
//        while (head != null) {
//            list.add(head);
//            head = head.next;
//        }
//        ListNode dummy = list.get(0);
//        for (int i = 1; i < list.size(); i++) {
//            if (i % 2 == 0) {
//                dummy.next = list.get(i / 2);
//            } else {
//                dummy.next = list.get(list.size() - i / 2 - 1);
//            }
//            dummy = dummy.next;
//        }
//        dummy.next = null;
//    }
}
