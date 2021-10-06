package easy;

import utils.ListNode;
import utils.PrintUtils;

public class RemoveLinkedListElements {

    public static void main(String[] args) {
        RemoveLinkedListElements removeLinkedListElements = new RemoveLinkedListElements();
        PrintUtils.printListNode(removeLinkedListElements.removeElements(new ListNode(1, new ListNode(1, new ListNode(3))), 1));
        PrintUtils.printListNode(removeLinkedListElements.removeElements(new ListNode(1, new ListNode(2, new ListNode(2))), 2));
        PrintUtils.printListNode(removeLinkedListElements.removeElements(new ListNode(3, new ListNode(3, new ListNode(3))), 3));
        PrintUtils.printListNode(removeLinkedListElements.removeElements(new ListNode(1, new ListNode(2, new ListNode(3))), 1));
        PrintUtils.printListNode(removeLinkedListElements.removeElements(new ListNode(1, new ListNode(2, new ListNode(3))), 2));
        PrintUtils.printListNode(removeLinkedListElements.removeElements(new ListNode(1, new ListNode(2, new ListNode(3))), 3));
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode();
        ListNode cur = head;
        dummy.next = cur;
        ListNode prev = dummy;
        while (cur != null) {
            if (cur.val == val) {
                prev.next = cur.next;
            } else {
                prev = prev.next;
            }
            cur = cur.next;
        }
        return dummy.next;
    }
}
