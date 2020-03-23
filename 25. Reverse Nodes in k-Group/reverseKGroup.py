# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class reverseKGroup:
	def solution(self, head, k):
		count = 0
		countReverse = 0
		check = head
		while count < k and check != None:
			count = count + 1
			check = check.next
		if count == k:
			curr, dummy = head, None
			while (countReverse < k and curr):
				curr, dummy, dummy.next = curr.next, curr, dummy
				countReverse = countReverse + 1
			if curr != None:
				head.next = self.solution(curr, k)
			return dummy
		else:
			return head

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
str1 = ""
while head:
	str1 = str1 + str(head.val) + "->"
	head = head.next
print(str1)

obj = reverseKGroup()
k = 3
b = obj.solution(node, k)
head1 = b
str2 = ""
while head1:
	str2 = str2 + str(head1.val) + "->"
	head1 = head1.next
print(str2)