package medium;

import utils.ListNode;

public class LinkedListCycleII {

    public static void main(String[] args) {
        LinkedListCycleII linkedListCycleII = new LinkedListCycleII();
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;
        System.out.println(linkedListCycleII.detectCycle(node1).val);
    }

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        boolean isStart = true;
        while (fast != null) {
            if (!isStart && fast == slow) {
                break;
            }
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
            }
            slow = slow.next;
            isStart = false;
        }
        if (fast == null) {
            return null;
        }
        ListNode dummy = head;
        while (dummy != slow) {
            dummy = dummy.next;
            slow = slow.next;
        }
        return dummy;
    }
}
