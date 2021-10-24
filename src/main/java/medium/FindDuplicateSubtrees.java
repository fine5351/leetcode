package medium;

import utils.TreeNode;

import java.util.*;

public class FindDuplicateSubtrees {

    public static void main(String[] args) {
        FindDuplicateSubtrees findDuplicateSubtrees = new FindDuplicateSubtrees();
        findDuplicateSubtrees.findDuplicateSubtrees(new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3,
                new TreeNode(2, new TreeNode(4), null), new TreeNode(4))));
    }

    private Map<String, Integer> subTreeMap = new HashMap<>();
    private List<TreeNode> result = new LinkedList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        travel(root, "");
        return result;
    }

    private String travel(TreeNode root, String path) {
        if (root == null) {
            return "#";
        }
        String leftPath = travel(root.left, path);
        String rightPath = travel(root.right, path);
        String subTree = leftPath + "," + rightPath + "," + root.val;
        int appearCount = subTreeMap.getOrDefault(subTree, 0) + 1;
        if (appearCount == 2) {
            result.add(root);
        }
        subTreeMap.put(subTree, appearCount);
        return subTree;
    }
}
