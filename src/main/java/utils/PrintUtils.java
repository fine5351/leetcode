package utils;

import mdeium.ListNode;

import java.util.concurrent.TimeUnit;

public class PrintUtils {

    public static void printListNode(ListNode head) {
        while (head != null) {
            try {
                TimeUnit.MILLISECONDS.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(head.val + " ,");
            head = head.next;
        }
        System.out.println();
        System.out.println("------------------");
    }
}
