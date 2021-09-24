package medium;

import utils.PrintUtils;
import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class UniqueBinarySearchTreesII {

    public static void main(String[] args) {
        UniqueBinarySearchTreesII uniqueBinarySearchTreesII = new UniqueBinarySearchTreesII();
        List<TreeNode> resultList = uniqueBinarySearchTreesII.generateTrees(3);
        resultList.forEach(o -> PrintUtils.printTreePreorder(o));
    }

    public List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new ArrayList<>();
        } else {
            return build(1, n);
        }
    }

    private List<TreeNode> build(int start, int end) {
        List<TreeNode> resultList = new ArrayList<>();
        if(start > end){
            resultList.add(null);
            return resultList;
        }
        else {
            for (int i = start; i <= end; i++) {
                List<TreeNode> left = build(start, i - 1);
                List<TreeNode> right = build(i + 1, end);
                for (TreeNode leftChild : left) {
                    for (TreeNode rightChild : right) {
                        TreeNode root = new TreeNode(i);
                        root.left = leftChild;
                        root.right = rightChild;
                        resultList.add(root);
                    }
                }
            }
            return resultList;
        }
    }

}
