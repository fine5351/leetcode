package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class PrintUtils {

    public static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println("-------------------");
    }

    public static void print2DArray(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println("-------------------");
    }

    public static void print2DArray(boolean[][] array) {
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

    public static void printTreePreorder(TreeNode root) {
        List<Integer> resultList = new ArrayList();
        travelPreorder(root, resultList);
        printList(resultList);
    }

    private static void travelPreorder(TreeNode root, List<Integer> resultList) {
        if (root != null) {
            resultList.add(root.val);
            travelPreorder(root.left, resultList);
            travelPreorder(root.right, resultList);
        }
    }

    public static void printTreePostOrder(TreeNode root) {
        List<Integer> resultList = new ArrayList();
        travelPostOrder(root, resultList);
        PrintUtils.printList(resultList);
    }

    private static void travelPostOrder(TreeNode root, List<Integer> resultList) {
        if (root != null) {
            travelPostOrder(root.left, resultList);
            travelPostOrder(root.right, resultList);
            resultList.add(root.val);
        }
    }

    public static void printTreeInorder(TreeNode root) {
        List<Integer> resultList = new ArrayList();
        travelInorder(root, resultList);
        PrintUtils.printList(resultList);
    }

    private static void travelInorder(TreeNode root, List<Integer> resultList) {
        if (root != null) {
            travelInorder(root.left, resultList);
            resultList.add(root.val);
            travelInorder(root.right, resultList);
        }
    }

    public static void printNode(Node root) {
        List<Integer> resultList = new ArrayList();
        travelPreorder(root, resultList);
        printList(resultList);
    }

    private static void travelPreorder(Node root, List<Integer> resultList) {
        if (root != null) {
            resultList.add(root.val);
            travelPreorder(root.left, resultList);
            travelPreorder(root.right, resultList);
        }
    }

}
