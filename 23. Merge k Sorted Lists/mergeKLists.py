# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class mergeKLists:
    def merge2Lists(self, l1, l2):
        if not l1:
            return l2
        if not l2:
            return l1
        if l1.val < l2.val:
            l1.next = self.merge2Lists(l1.next, l2)
            return l1
        else:
            l2.next = self.merge2Lists(l1, l2.next)
            return l2

    def merge(self, lists: List[ListNode], start, end):
        if start == end:
            return lists[start]
        mid = (start + end) // 2
        l1 = self.merge(lists, start, mid)
        l2 = self.merge(lists, mid + 1, end)
        return self.merge2Lists(l1, l2)

    def solution(self, lists: List[ListNode]) -> ListNode:
        if not lists:
            return []
        return self.merge(lists, 0, len(lists) - 1)

