/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

import java.util.HashMap;
import java.util.Map;

class Solution {
    Map<Node, Node> m;

    public void dfs(Node node, Node cloneNode) {
        for (Node n : node.neighbors) {
            if (!m.containsKey(n)) {
                Node nn = new Node(n.val);
                m.put(n, nn);
                // cloneNode.neighbors.length;
                dfs(n, nn);
            } else {
                // cloneNode.neighbors.length;
            }
        }
    }

    public Node cloneGraph(Node node) {
        if (node == null)
            return null;

        m = new HashMap<>();
        Node cloneNode = new Node(node.val);
        m.put(node, cloneNode);
        dfs(node, cloneNode);
        return cloneNode;
    }
}