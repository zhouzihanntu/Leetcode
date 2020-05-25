class Node:
    def __init__(self, key = None, val = None):
        self.key = key
        self.val = val
        self.prev = None
        self.next = None

class LRUCache:
    def __init__(self, capacity: int):
        self.capacity = capacity
        self.hashmap = {}
        self.head = Node()
        self.tail = Node()
        self.head.next = self.tail
        self.tail.prev = self.head

    def move_node_to_head(self, key):
        curr = self.hashmap[key]
        curr.next.prev = curr.prev
        curr.prev.next = curr.next
        curr.prev = self.head
        curr.next = self.head.next
        self.head.next.prev = curr
        self.head.next = curr


    def get(self, key: int) -> int:
        if self.hashmap.__contains__(key):
            self.move_node_to_head(key)
        res = self.hashmap.get(key, -1)
        if res == -1:
            return res
        else:
            return res.val

    def put(self, key: int, value: int) -> None:
        if self.hashmap.__contains__(key):
            self.hashmap[key].val = value
            self.move_node_to_head(key)
        else:
            if len(self.hashmap) == self.capacity:
                self.hashmap.pop(self.tail.prev.key)
                self.tail.prev.prev.next = self.tail
                self.tail.prev = self.tail.prev.prev
        
            curr = Node(key, value)
            self.hashmap[key] = curr
            curr.prev = self.head
            curr.next = self.head.next
            self.head.next.prev = curr
            self.head.next = curr           



# Your LRUCache object will be instantiated and called as such:
# obj = LRUCache(capacity)
# param_1 = obj.get(key)
# obj.put(key,value)