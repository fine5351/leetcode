package medium;

import utils.ListNode;

public class RotateList {

    public static void main(String[] args) {
        RotateList rotateList = new RotateList();
        ListNode head = rotateList.rotateRight(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))), 0);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
        System.out.println("---------");
        head = rotateList.rotateRight(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))), 1);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
        System.out.println("---------");
        head = rotateList.rotateRight(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))), 2);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
        System.out.println("---------");
        head = rotateList.rotateRight(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))), 3);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
        System.out.println("---------");
        head = rotateList.rotateRight(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))), 4);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
        System.out.println("---------");
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        ListNode current = head;
        int size = 1;
        while (current.next != null) {
            size++;
            current = current.next;
        }
        current.next = head;
        int rotate = size - (k % size);
        while (rotate > 0) {
            current = current.next;
            rotate--;
        }
        ListNode nextHead = current.next;
        current.next = null;
        return nextHead;
    }

//    public ListNode rotateRight(ListNode head, int k) {
//        ListNode dummy = new ListNode();
//        dummy.next = head;
//        List<ListNode> list = transToList(head);
//        int rotate = k % list.size();
//        if (rotate == 0) {
//            return head;
//        }
//        return rotateList(list, rotate);
//    }
//
//    private List<ListNode> transToList(ListNode head) {
//        List<ListNode> result = new ArrayList<>();
//        while (head != null) {
//            result.add(head);
//            head = head.next;
//        }
//        return result;
//    }
//
//    private ListNode rotateList(List<ListNode> list, int rotate) {
//        int size = list.size();
//        ListNode dummy = new ListNode();
//        ListNode head = list.get(size - rotate == size ? 0 : size - rotate);
//        dummy.next = head;
//        for (int i = 1; i < size; i++) {
//            int index = size - rotate + i;
//            if (index >= size) {
//                index = index - size;
//            }
//            head.next = list.get(index);
//            head = head.next;
//        }
//        head.next = null;
//        return dummy.next;
//    }

}
