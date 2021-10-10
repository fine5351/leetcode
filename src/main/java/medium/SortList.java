package medium;

import utils.ListNode;
import utils.PrintUtils;

public class SortList {

    public static void main(String[] args) {
        SortList sortList = new SortList();
        PrintUtils.printListNode(sortList.sortList(new ListNode(4, new ListNode(2,
                new ListNode(1, new ListNode(3))))));
        PrintUtils.printListNode(sortList.sortList(new ListNode(1, new ListNode(3, new ListNode(2)))));
        PrintUtils.printListNode(sortList.sortList(new ListNode(3, new ListNode(2, new ListNode(1)))));
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = head;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        prev.next = null;
        return merge(sortList(head), sortList(slow));
    }

    private ListNode merge(ListNode head1, ListNode head2) {
        ListNode newHead = new ListNode();
        ListNode dummy = newHead;
        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                newHead.next = head1;
                head1 = head1.next;
            } else {
                newHead.next = head2;
                head2 = head2.next;
            }
            newHead = newHead.next;
        }
        if (head1 != null) {
            newHead.next = head1;
        }
        if (head2 != null) {
            newHead.next = head2;
        }
        return dummy.next;
    }

}
