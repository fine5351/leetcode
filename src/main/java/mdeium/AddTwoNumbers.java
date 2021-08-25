package mdeium;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode headNode = new ListNode();
        ListNode currNode = headNode;
        ListNode p = l1, q = l2;
        int carry = 0;
        while (p != null || q != null) {
            int x = p != null ? p.val : 0;
            int y = q != null ? q.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            currNode.val = sum % 10;
            if(carry > 0 || ((p != null && p.next != null) || (q != null && q.next != null))){
                currNode.next = new ListNode(carry);
            }
            currNode = currNode.next;
            p = p != null ? p.next : p;
            q = q != null ? q.next : q;
        }
        return headNode;
    }

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

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
