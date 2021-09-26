package easy;

import utils.ListNode;

public class IntersectionOfTwoLinkedLists {

    public static void main(String[] args) {
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = getLength(headA);
        int lengthB = getLength(headB);
        while (lengthA != lengthB) {
            if (lengthA > lengthB) {
                lengthA--;
                headA = headA.next;
            } else {
                lengthB--;
                headB = headB.next;
            }
        }

        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }

    private int getLength(ListNode head) {
        ListNode node = head;
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

}
