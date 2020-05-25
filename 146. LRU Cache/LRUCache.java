class Node {
    int key;
    int val;
    Node prev;
    Node next;

    public Node() {

    }

    public Node(int key, int val) {
        this.key = key;
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

class LRUCache {
    int capacity;
    HashMap<Integer, Node> map;
    Node head;
    Node tail;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
    }

    public void move_node_to_head(int key) {
        Node curr = map.get(key);
        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;
        
        curr.next = head.next;
        curr.prev = head;
        head.next.prev = curr;
        head.next = curr;
    }
    
    public int get(int key) {
        if (map.containsKey(key)) {
            move_node_to_head(key);
        }
        Node res = new Node(-1, -1);
        res = map.getOrDefault(key, res);
        return res.val;
    }
    
    public void put(int key, int value) {
        Node curr = new Node(key, value);
        if (map.containsKey(key)) {
            curr = map.get(key);
            curr.val = value;
            map.put(key, curr);
            move_node_to_head(key);
        } else {
            if (map.size() == capacity) {
                map.remove(tail.prev.key);
                tail.prev.prev.next = tail;
                tail.prev = tail.prev.prev;
            }
            map.put(key, curr);
            curr.prev = head;
            curr.next = head.next;
            head.next.prev = curr;
            head.next = curr;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */