package easy;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class SumOfLeftLeaves {

    public static void main(String[] args) {
        SumOfLeftLeaves sumOfLeftLeaves = new SumOfLeftLeaves();
        System.out.println(sumOfLeftLeaves.sumOfLeftLeaves(new TreeNode(3, new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
    }

    public int sumOfLeftLeaves(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        travel(root, result);
        int sum = 0;
        for (int i = 0; i < result.size(); i++) {
            sum += result.get(i);
        }
        return sum;
    }

    private void travel(TreeNode root, List<Integer> list) {
        if (root != null) {
            if (root.left != null) {
                if (root.left.left == null && root.left.right == null) {
                    list.add(root.left.val);
                }
            }
            travel(root.left, list);
            travel(root.right, list);
        }
    }

}
