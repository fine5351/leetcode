package medium;

import utils.ListNode;
import utils.PrintUtils;

public class RemoveDuplicatesFromSortedListII {

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedListII removeDuplicatesFromSortedListII = new RemoveDuplicatesFromSortedListII();
        ListNode listNode = removeDuplicatesFromSortedListII.deleteDuplicates(new ListNode(1, new ListNode(2,
                new ListNode(3, new ListNode(3, new ListNode(4, new ListNode(4, new ListNode(5))))))));
        PrintUtils.printListNode(listNode);
        listNode = removeDuplicatesFromSortedListII.deleteDuplicates(new ListNode(1, new ListNode(1,
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(3))))))));
        PrintUtils.printListNode(listNode);
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        if(head.next != null && head.val == head.next.val){
            while (head.next != null && head.val == head.next.val){
                head = head.next;
            }
            return deleteDuplicates(head.next);
        }
        head.next = deleteDuplicates(head.next);
        return head;
    }

}
