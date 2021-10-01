package medium;

import utils.TreeNode;

public class SumRootToLeafNumbers {

    public static void main(String[] args) {
        SumRootToLeafNumbers sumRootToLeafNumbers = new SumRootToLeafNumbers();
        System.out.println(sumRootToLeafNumbers.sumNumbers(new TreeNode(1, new TreeNode(2), new TreeNode(3))));
        System.out.println(sumRootToLeafNumbers.sumNumbers(new TreeNode(4, new TreeNode(9, new TreeNode(5), new TreeNode(1)),
                new TreeNode(0))));
        System.out.println(sumRootToLeafNumbers.sumNumbers(new TreeNode(1, new TreeNode(0),
                null)));
        System.out.println(sumRootToLeafNumbers.sumNumbers(new TreeNode(1, null, new TreeNode(5))));
    }

    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Integer.valueOf(preorderTravel(root, 0));
    }

    private Integer preorderTravel(TreeNode root, int sum) {
        if (root != null) {
            sum = sum * 10 + root.val;
            if (root.left == null && root.right == null) {
                return sum;
            } else {
                int leftVal = preorderTravel(root.left, sum);
                int rightVal = preorderTravel(root.right, sum);
                return leftVal + rightVal;
            }
        } else {
            return 0;
        }
    }
//    private Integer preorderTravel(TreeNode root, String numbers) {
//        if (root != null) {
//            numbers += root.val;
//            if (root.left == null && root.right == null) {
//                return Integer.valueOf(numbers);
//            } else {
//                int leftVal = preorderTravel(root.left, numbers);
//                int rightVal = preorderTravel(root.right, numbers);
//                return leftVal + rightVal;
//            }
//        } else {
//            return 0;
//        }
//    }

}
