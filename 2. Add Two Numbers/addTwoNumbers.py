# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
    	newNode = ListNode(0)
    	iNode = newNode
    	carry = 0
    	while l1 or l2:
    		x = l1.val if l1 else 0
    		y = l2.val if l2 else 0
    		sum = x + y + carry
    		carry = sum // 10

    		iNode.next = ListNode(sum%10)
    		iNode = iNode.next

    		if l1 != None:
    			l1 = l1.next
    		if l2 != None:
    			l2 = l2.next 
    	if carry:
    		iNode.next = ListNode(1)
    	return newNode.next

test = Solution()
l1 = ListNode(2)
l1.next = ListNode(4)
l1.next.next = ListNode(3)
l2 = ListNode(5)
l2.next = ListNode(6)
l2.next.next = ListNode(4)

res = test.addTwoNumbers(l1,l2)
print(res.val, res.next.val, res.next.next.val)