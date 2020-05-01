/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class mergeTwoLists {
    public ListNode solution(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode dummy = head;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
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
}