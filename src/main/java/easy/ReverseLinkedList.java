package easy;

import mdeium.ListNode;
import utils.PrintUtils;

import java.net.BindException;

public class ReverseLinkedList {

    public static void main(String[] args) {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode head = reverseLinkedList.reverseList(new ListNode(1, new ListNode(2, new ListNode(3))));
        PrintUtils.printListNode(head);
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        head = prev;
        return prev;
    }

}
