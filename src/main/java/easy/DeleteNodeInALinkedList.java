package easy;

import utils.ListNode;
import utils.PrintUtils;

public class DeleteNodeInALinkedList {

    public static void main(String[] args) {
        DeleteNodeInALinkedList deleteNodeInALinkedList = new DeleteNodeInALinkedList();
        ListNode head = new ListNode(4, new ListNode(5, new ListNode(1, new ListNode(9))));
        ListNode cur = head;
        for (int i = 0; i < 1; i++) {
            cur = cur.next;
        }
        deleteNodeInALinkedList.deleteNode(cur);
        PrintUtils.printListNode(head);
    }

    public void deleteNode(ListNode node) {
        ListNode prev = null;
        while (node.next != null) {
            System.out.println(node.val + " -> " + node.next.val);
            node.val = node.next.val;
            prev = node;
            node = node.next;
        }
        prev.next = null;
    }
}
