package utils;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class PrintUtils {

    public static void print2DArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println("-------------------");
    }

    public static void print2DArray(boolean[][] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println("-------------------");
    }

    public static void printList(List<?> list) {
        list.forEach(o -> System.out.print(o + " ,"));
        System.out.println();
        System.out.println("-----------------------");
    }

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
