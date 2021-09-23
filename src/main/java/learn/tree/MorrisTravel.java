package learn.tree;

import utils.PrintUtils;
import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class MorrisTravel {

    public static void main(String[] args) {
        MorrisTravel morrisTravel = new MorrisTravel();
        List<Integer> resultList = morrisTravel.morrisTravel(new TreeNode(1, new TreeNode(2, new TreeNode(3), null), null));
        PrintUtils.printList(resultList);
    }

    private List<Integer> morrisTravel(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();
        TreeNode pre = null;
        TreeNode cur = root;
        while (cur != null) {
            if (cur.left == null) {
                resultList.add(cur.val);
                cur = cur.right;
            } else {
                pre = cur.left;
                while (pre.right != null && pre.right != cur) {
                    pre = pre.right;
                }
                if (pre.right == null) {
                    pre.right = cur;
                    cur = cur.left;
                } else {
                    pre.right = null;
                    resultList.add(cur.val);
                    cur = cur.right;
                }
            }
        }
        return resultList;
    }
}
