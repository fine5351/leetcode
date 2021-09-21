package medium;

import utils.ListNode;

import java.util.ArrayList;
import java.util.List;

public class SwapPairs {

    public static void main(String[] args) {
//        ListNode head = new SwapPairs().swapPairs(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))));
        ListNode head = new SwapPairs().swapPairs(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))));
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode();
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        ListNode listNode = new ListNode();
        dummy = listNode;
        ListNode tail = null;
        int size = 0;
        if (list.size() % 2 == 0) {
            size = list.size();
        } else {
            size = list.size() - 1;
            tail = new ListNode(list.get(list.size() - 1));
        }
        for (int i = 0; i < size; i++) {
            if ((i + 1) % 2 == 0) {
                listNode.next = new ListNode(list.get(i - 1));
            } else {
                listNode.next = new ListNode(list.get(i + 1));
            }
            listNode = listNode.next;
        }
        listNode.next = tail;
        return dummy.next;
    }

}
