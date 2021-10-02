package medium;

import utils.Node;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {

    public static void main(String[] args) {

    }

    public Node copyRandomList(Node head) {
        return dfsClone(head, new HashMap<>());
    }

    private Node dfsClone(Node head, Map<Node, Node> map) {
        if (head != null) {
            if (map.containsKey(head)) {
                return map.get(head);
            } else {
                Node cloneNode = new Node(head.val);
                map.put(head, cloneNode);
                cloneNode.next = dfsClone(head.next, map);
                cloneNode.random = dfsClone(head.random, map);
                return cloneNode;
            }
        }
        return null;
    }
}
