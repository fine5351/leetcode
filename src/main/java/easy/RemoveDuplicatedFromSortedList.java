package easy;

import utils.ListNode;
import utils.PrintUtils;

public class RemoveDuplicatedFromSortedList {

    public static void main(String[] args) {
        RemoveDuplicatedFromSortedList removeDuplicatedFromSortedList = new RemoveDuplicatedFromSortedList();
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3)))));
        PrintUtils.printListNode(removeDuplicatedFromSortedList.deleteDuplicates(head));

    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        while (head != null) {
            while (head.next != null && head.val == head.next.val) {
                head.next = head.next.next;
            }
            head = head.next;
        }
        return dummy.next;
    }

}
