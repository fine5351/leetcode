package learn.tree;

import utils.Node;
import utils.PrintUtils;

public class PopulatingNextRightPointersInEachNode {

    public static void main(String[] args) {
        PopulatingNextRightPointersInEachNode populatingNextRightPointersInEachNode = new PopulatingNextRightPointersInEachNode();
        Node root = populatingNextRightPointersInEachNode.connect(new Node(1, new Node(2, new Node(4), new Node(5)), new Node(3,
                new Node(6), new Node(7))));
        PrintUtils.printNode(root);
    }

    public Node connect(Node root) {
        if (root != null) {
            if (root.left != null) {
                root.left.next = root.right;
            }
            if (root.right != null && root.next != null) {
                root.right.next = root.next.left;
            }
            connect(root.left);
            connect(root.right);
        }
        return root;
    }

//    public Node connect(Node root) {
//        if (root == null) {
//            return null;
//        }
//        List<List<Node>> levelList = new ArrayList<>();
//        levelTravel(root, 0, levelList);
//        for (int i = 0; i < levelList.size(); i++) {
//            for (int j = 0; j < levelList.get(i).size() - 1; j++) {
//                levelList.get(i).get(j).next = levelList.get(i).get(j + 1);
//            }
//        }
//        return levelList.get(0).get(0);
//    }
//
//    private void levelTravel(Node root, int level, List<List<Node>> levelList) {
//        if (root != null) {
//            List<Node> temp = null;
//            if (level >= levelList.size()) {
//                temp = new ArrayList<>();
//                levelList.add(temp);
//            } else {
//                temp = levelList.get(level);
//            }
//            temp.add(root);
//            levelTravel(root.left, level + 1, levelList);
//            levelTravel(root.right, level + 1, levelList);
//        }
//    }
}
