package mdeium;

import java.util.concurrent.TimeUnit;

public class PartitionList {

    public static void main(String[] args) {
        PartitionList partitionList = new PartitionList();
        ListNode head = partitionList.partition(new ListNode(1, new ListNode(4, new ListNode(3,
                new ListNode(2, new ListNode(5, new ListNode(2)))))), 3);
        partitionList.printListNode(head);
    }

    public ListNode partition(ListNode head, int x) {
        ListNode newSmallHead = new ListNode();
        ListNode newBigHead = new ListNode();
        ListNode smallDummy = new ListNode();
        ListNode bigDummy = new ListNode();
        smallDummy.next = newSmallHead;
        bigDummy.next = newBigHead;
        while (head != null) {
            if (head.val < x) {
                System.out.println("將 " + head.val + " 放入小列");
                newSmallHead.next = head;
                newSmallHead = newSmallHead.next;
            } else {
                System.out.println("將 " + head.val + " 放入大列");
                newBigHead.next = head;
                newBigHead = newBigHead.next;
            }
            head = head.next;
        }
        newBigHead.next = null;
        newSmallHead.next = bigDummy.next.next;
        return smallDummy.next.next;
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
