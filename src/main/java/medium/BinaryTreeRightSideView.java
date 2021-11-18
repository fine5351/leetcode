package medium;

import utils.TreeNode;

import java.util.*;

public class BinaryTreeRightSideView {

    public static void main(String[] args) {
        BinaryTreeRightSideView binaryTreeRightSideView = new BinaryTreeRightSideView();
//        List<Integer> result = binaryTreeRightSideView.rightSideView(new TreeNode(1, new TreeNode(2), null));
//        result.forEach(System.out::println);
        List<Integer> result = binaryTreeRightSideView.rightSideView(new TreeNode(1, new TreeNode(2, new TreeNode(4),
                new TreeNode(5)),
                new TreeNode(3, new TreeNode(6), new TreeNode(7))));
        result.forEach(System.out::println);
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root != null) {
            Deque<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                result.add(queue.getLast().val);
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                }
            }
        }
        return result;
    }

}
