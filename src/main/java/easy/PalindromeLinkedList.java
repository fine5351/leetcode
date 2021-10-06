package easy;

import utils.ListNode;

import java.util.Stack;

public class PalindromeLinkedList {

    public static void main(String[] args) {
        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        System.out.println(palindromeLinkedList.isPalindrome(new ListNode(1,
                new ListNode(2, new ListNode(2, new ListNode(1))))));
        System.out.println(palindromeLinkedList.isPalindrome(new ListNode(1,
                new ListNode(2, new ListNode(2, new ListNode(2))))));

        System.out.println(palindromeLinkedList.isPalindrome(new ListNode(1,
                new ListNode(2, new ListNode(3, new ListNode(2, new ListNode(1)))))));
        System.out.println(palindromeLinkedList.isPalindrome(new ListNode(1,
                new ListNode(2, new ListNode(3, new ListNode(2, new ListNode(3)))))));
    }

    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null) {
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
                stack.add(slow.val);
            }
            slow = slow.next;
        }

        while (slow != null) {
            if (slow.val != stack.pop()) {
                return false;
            }
            slow = slow.next;
        }
        return true;
    }

//    public boolean isPalindrome(ListNode head) {
//        ListNode first = head;
//        StringBuilder builder = new StringBuilder();
//        while (first != null) {
//            builder.append(first.val);
//            first = first.next;
//        }
//
//        return  builder.toString().equals(builder.reverse().toString());
//    }
}
