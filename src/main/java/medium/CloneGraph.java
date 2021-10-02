package medium;

import utils.GraphNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CloneGraph {

    public static void main(String[] args) {

    }

    public GraphNode cloneGraph(GraphNode node) {
        return dfsClone(node, new HashMap<>());
    }

    private GraphNode dfsClone(GraphNode node, Map<Integer, GraphNode> map) {
        if (node != null) {
            if (map.containsKey(node.val)) {
                return map.get(node.val);
            } else {
                GraphNode cloneNode = new GraphNode(node.val);
                cloneNode.neighbors = new ArrayList<>();
                map.put(node.val, cloneNode);
                for (int i = 0; i < node.neighbors.size(); i++) {
                    cloneNode.neighbors.add(dfsClone(node.neighbors.get(i), map));
                }
            }
        }
        return null;
    }
}
