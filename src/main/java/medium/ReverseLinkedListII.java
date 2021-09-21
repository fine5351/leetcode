package medium;

import utils.ListNode;
import utils.PrintUtils;

public class ReverseLinkedListII {

    public static void main(String[] args) {
        ReverseLinkedListII reverseLinkedListII = new ReverseLinkedListII();
        ListNode head = reverseLinkedListII.reverseBetween(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 2, 3);
        PrintUtils.printListNode(head);
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode cur = dummy;
        ListNode prev = null;

        for (int i = 0; i < left; i++) {
            prev = cur;
            cur = cur.next;
        }

        ListNode cur2 = cur;
        ListNode prev2 = prev;
        ListNode temp;
        for (int i = left; i <= right; i++) {
            temp = cur2.next;
            cur2.next = prev2;
            prev2 = cur2;
            cur2 = temp;
        }
        PrintUtils.printListNode(cur2);
        prev.next = prev2;
        cur.next = cur2;
        return dummy.next;
    }

}
