package mdeium;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromSortedListII {

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedListII removeDuplicatesFromSortedListII = new RemoveDuplicatesFromSortedListII();
        ListNode listNode = removeDuplicatesFromSortedListII.deleteDuplicates(new ListNode(1, new ListNode(2,
                new ListNode(3, new ListNode(3, new ListNode(4, new ListNode(4, new ListNode(5))))))));
        removeDuplicatesFromSortedListII.printListNode(listNode);
        listNode = removeDuplicatesFromSortedListII.deleteDuplicates(new ListNode(1, new ListNode(1,
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(3))))))));
        removeDuplicatesFromSortedListII.printListNode(listNode);
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

    private void printListNode(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ,");
            head = head.next;
        }
        System.out.println();
        System.out.println("------------------");
    }

}
