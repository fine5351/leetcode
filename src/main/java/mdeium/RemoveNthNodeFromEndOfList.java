package mdeium;

import java.util.ArrayList;
import java.util.List;

public class RemoveNthNodeFromEndOfList {

    public static void main(String[] args) {
        ListNode head = new RemoveNthNodeFromEndOfList().removeNthFromEnd(new ListNode(1, new ListNode(2, new ListNode(3))), 1);
        println(head);
        ListNode head2 = new RemoveNthNodeFromEndOfList().removeNthFromEnd(new ListNode(1), 1);
        println(head2);
        ListNode head3 = new RemoveNthNodeFromEndOfList().removeNthFromEnd(new ListNode(1, new ListNode(2, new ListNode(3))), 3);
        println(head3);
        ListNode head4 = new RemoveNthNodeFromEndOfList().removeNthFromEnd(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 2);
        println(head4);
    }

    private static void println(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
        System.out.println("-------");
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = head;
        while (n > 0) {
            fast = fast.next;
            n--;
        }
        ListNode slow = dummy;
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }

    private int getSize(ListNode head) {
        int size = 0;
        ListNode node = head;
        while (node != null) {
            size++;
            node = node.next;
        }
        return size;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
