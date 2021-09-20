package easy;

import utils.ListNode;
import utils.PrintUtils;

public class MergeTwoSortedList {

    public static void main(String[] args) {
        MergeTwoSortedList mergeTwoSortedList = new MergeTwoSortedList();
        ListNode head = mergeTwoSortedList.mergeTwoLists(new ListNode(1, new ListNode(2, new ListNode(4))), new ListNode(1, new ListNode(3, new ListNode(4))));
        PrintUtils.printListNode(head);
        head = mergeTwoSortedList.mergeTwoLists(null, null);
        PrintUtils.printListNode(head);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode cur = new ListNode();
        dummy.next = cur;

        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    cur.next = l1;
                    l1 = l1.next;
                } else {
                    cur.next = l2;
                    l2 = l2.next;
                }
            } else if (l1 != null) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }

        return dummy.next.next;
    }
}
