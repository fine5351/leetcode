package medium;

import utils.ListNode;
import utils.PrintUtils;

public class AddTwoNumbers {

    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode head = addTwoNumbers.addTwoNumbers(new ListNode(1, new ListNode(2, new ListNode(3))), new ListNode(4,
                new ListNode(5, new ListNode(6))));
        PrintUtils.printListNode(head);
        head = addTwoNumbers.addTwoNumbers(new ListNode(9, new ListNode(9)), new ListNode(9,
                new ListNode(9, new ListNode(9))));
        PrintUtils.printListNode(head);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode dummy = new ListNode();
        dummy.next = head;
        while (l1 != null || l2 != null) {
            int a = l1 != null ? l1.val : 0;
            int b = l2 != null ? l2.val : 0;
            int sum = a + b + head.val;
            head.val = sum % 10;
            if (sum >= 10 || (l1 != null && l1.next != null) || (l2 != null && l2.next != null)) {
                head.next = new ListNode(sum / 10);
                head = head.next;
            }
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        return dummy.next;
    }


//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode headNode = new ListNode();
//        ListNode currNode = headNode;
//        ListNode p = l1, q = l2;
//        int carry = 0;
//        while (p != null || q != null) {
//            int x = p != null ? p.val : 0;
//            int y = q != null ? q.val : 0;
//            int sum = x + y + carry;
//            carry = sum / 10;
//            currNode.val = sum % 10;
//            if (carry > 0 || ((p != null && p.next != null) || (q != null && q.next != null))) {
//                currNode.next = new ListNode(carry);
//            }
//            currNode = currNode.next;
//            p = p != null ? p.next : p;
//            q = q != null ? q.next : q;
//        }
//        return headNode;
//    }

//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        String[] resultValues = String.valueOf(calcualteList(l1).add(calcualteList(l2))).split("");
//        ListNode resultListNode = new ListNode();
//        ListNode firstNode = resultListNode;
//        int size = resultValues.length;
//        while (size > 1) {
//            resultListNode.val = Integer.valueOf(resultValues[size - 1]);
//            resultListNode.next = new ListNode();
//            resultListNode = resultListNode.next;
//            size--;
//        }
//        resultListNode.val = Integer.valueOf(resultValues[size - 1]);
//        return firstNode;
//    }

//    private BigInteger calcualteList(ListNode listNode) {
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.insert(0, listNode.val);
//        while (listNode.next != null) {
//            listNode = listNode.next;
//            stringBuilder.insert(0, listNode.val);
//        }
//
//        return new BigInteger(stringBuilder.toString());
//    }

}
