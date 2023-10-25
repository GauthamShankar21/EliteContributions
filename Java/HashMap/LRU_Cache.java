import java.util.HashMap;
import java.util.Map;

class LRUCache {
    Map<Integer, Node> map = new HashMap<>();
    int cap;
    Node head = new Node(0);
    Node tail = new Node(0);

    public LRUCache(int capacity) {
        cap = capacity;
        head.next = tail;
        tail.prev = head;

    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node ans = map.get(key);
            remove(ans);
            insert(ans);

            return ans.value;
        } else {
            return -1;
        }

    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            remove(map.get(key));
        }
        if (map.size() == cap) {
            remove(tail.prev);
        }
        insert(new Node(key));

    }

    public void insert(Node node) {
        map.put(node.key, node);
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head;

    }

    public void remove(Node node) {
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;

    }
}

class Node {
    Node prev, next;
    int key, value;
    Node[] neighbors;
    public int val;

    Node(int key) {
        this.key = key;
        // this.value = value;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */