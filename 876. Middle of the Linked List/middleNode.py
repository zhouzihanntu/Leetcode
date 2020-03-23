# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class middleNode:
    def solution(self, head):
    	p1 = head
    	p2 = head
    	p2Forward = True
    	while p1:
    		p1 = p1.next
    		p2Forward = not p2Forward
    		if p2Forward:
    			p2 = p2.next
    	return p2

node = ListNode(1)
node1 = ListNode(2)
node2 = ListNode(3)
node3 = ListNode(4)
node4 = ListNode(5)
node5 = ListNode(6)

node.next = node1
node1.next = node2
node2.next = node3
node3.next = node4
node4.next = node5
head = node
str1 = ""
while head:
	str1 = str1 + str(head.val) + "->"
	head = head.next
print(str1)

obj = middleNode()
res = obj.solution(node)
str2 = ""
while res:
	str2 = str2 + str(res.val) + "->"
	res = res.next
print(str2)
