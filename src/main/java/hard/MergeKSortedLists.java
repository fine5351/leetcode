package hard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.ListNode;
import utils.PrintUtils;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLists {

    private static final Logger logger = LoggerFactory.getLogger(MergeKSortedLists.class);

    public static void main(String[] args) {
        MergeKSortedLists mergeKSortedLists = new MergeKSortedLists();
        ListNode[] listNodes = new ListNode[2];
        ListNode head1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode head2 = new ListNode(1, new ListNode(3, new ListNode(5)));
        listNodes[0] = head1;
        listNodes[1] = head2;
//        ListNode[] listNodes = new ListNode[3];
//        ListNode head1 = new ListNode(1, new ListNode(4, new ListNode(5)));
//        ListNode head2 = new ListNode(1, new ListNode(3, new ListNode(5)));
//        ListNode head3 = new ListNode(2, new ListNode(6, new ListNode(7)));
//        listNodes[0] = head1;
//        listNodes[1] = head2;
//        listNodes[2] = head3;
        ListNode newHead = mergeKSortedLists.mergeKLists(listNodes);
        PrintUtils.printListNode(newHead);
    }

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> queue = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });

        for (ListNode head : lists) {
            while (head != null) {
                queue.offer(head);
                head = head.next;
            }
        }

        logger.info("size : {}", queue.size());

        ListNode dummy = new ListNode();
        ListNode newHead = dummy;
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            newHead.next = queue.poll();
            newHead = newHead.next;
        }
        newHead.next = null;
        return dummy.next;
    }
}
