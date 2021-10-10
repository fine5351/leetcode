package medium;

import utils.ListNode;
import utils.PrintUtils;

public class InsertionSortList {

    public static void main(String[] args) {
        InsertionSortList insertionSortList = new InsertionSortList();
        ListNode newHead = insertionSortList.insertionSortList(new ListNode(4, new ListNode(2,
                new ListNode(1, new ListNode(3)))));
        PrintUtils.printListNode(newHead);
        newHead = insertionSortList.insertionSortList(new ListNode(1, new ListNode(3, new ListNode(2))));
        PrintUtils.printListNode(newHead);
        newHead = insertionSortList.insertionSortList(new ListNode(3, new ListNode(2, new ListNode(1))));
        PrintUtils.printListNode(newHead);
    }

    public ListNode insertionSortList(ListNode head) {
        ListNode newHead = new ListNode(head.val);
        ListNode dummy = new ListNode();
        dummy.next = newHead;
        head = head.next;
        while (head != null) {
            if (head.val < newHead.val) {
                ListNode prev = new ListNode(head.val);
                prev.next = newHead;
                dummy.next = prev;
            } else {
                while (newHead.next != null && newHead.next.val < head.val) {
                    newHead = newHead.next;
                }
                ListNode next = newHead.next;
                newHead.next = new ListNode(head.val);
                newHead.next.next = next;
            }
            newHead = dummy.next;
            head = head.next;
        }
        return dummy.next;
    }
}
