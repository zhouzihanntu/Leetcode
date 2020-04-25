/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class mergeKLists {
    public ListNode merge2Lists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode dummy = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                dummy.next = l1;
                l1 = l1.next;
                dummy = dummy.next;
            }
            else {
                dummy.next = l2;
                l2 = l2.next;
                dummy = dummy.next;
            }
        }
        while (l1 != null) {
            dummy.next = l1;
            l1 = l1.next;
            dummy = dummy.next;
        }
        while (l2 != null) {
            dummy.next = l2;
            l2 = l2.next;
            dummy = dummy.next;
        }
        return head.next;
    }

    public ListNode merge(ListNode[] lists, int start, int end) {
        if (start == end) {
            return lists[start];
        }
        int mid = (start + end) / 2;
        ListNode l1 = merge(lists, start, mid);
        ListNode l2 = merge(lists, mid + 1, end);
        return merge2Lists(l1, l2);
    }

    public ListNode solution(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        return merge(lists, 0, lists.length - 1);
    }
}