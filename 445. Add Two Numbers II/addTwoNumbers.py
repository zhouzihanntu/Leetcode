# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class addTwoNumbers:
    def solution(self, l1: ListNode, l2: ListNode) -> ListNode:
        head = ListNode(None)
        arr1 = []
        arr2 = []
        while l1:
            arr1.append(l1.val)
            l1 = l1.next
        while l2:
            arr2.append(l2.val)
            l2 = l2.next
        carry = 0
        while arr1 or arr2:
            x = arr1[-1] if arr1 else 0
            y = arr2[-1] if arr2 else 0
            sum = x + y + carry
            carry = sum // 10
            node = ListNode(sum % 10)
            node.next = head
            head = node
            if arr1:
                arr1 = arr1[:-1]
            if arr2:
                arr2 = arr2[:-1]
        if carry:
            node = ListNode(1)
            node.next = head
            head = node
        return head



obj = addTwoNumbers()
l1 = ListNode(7)
l1.next = ListNode(2)
l1.next.next = ListNode(4)
l1.next.next.next = ListNode(3)
l2 = ListNode(5)
l2.next = ListNode(6)
l2.next.next = ListNode(4)

res = obj.solution(l1,l2)
print(res.val, res.next.val, res.next.next.val, res.next.next.next.val)