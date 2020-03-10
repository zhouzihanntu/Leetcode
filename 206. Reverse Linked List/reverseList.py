class ListNode:
    def __init__(self, x: int):
        self.val = x
        self.next = None


class ReverseList:

    def solution(self, head):
        curr, dummy = head, None
        while curr:
            curr, dummy, dummy.next = curr.next, curr, dummy
        return dummy
        



node = ListNode(1)
node1 = ListNode(2)
node2 = ListNode(3)
node3 = ListNode(4)
node4 = ListNode(5)

node.next = node1
node1.next = node2
node2.next = node3
node3.next = node4

head = node
Str = ""
while head:
    Str = Str + str(head.val) + "->"
    head = head.next
print(Str[0:-2])

obj = ReverseList()
b = obj.solution(node)
Str = ""
while b:
    Str = Str + str(b.val) + "->"
    b = b.next
print(Str[0:-2])
