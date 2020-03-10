class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
    	val = x;
    }
}

public class reverseList {
    public ListNode solution(ListNode head) {
    	ListNode curr = head;
    	ListNode dummy = null;
    	while(curr != null){
    		ListNode nextTemp = curr.next;
            curr.next = dummy;
            dummy = curr;
    		curr = nextTemp;
    	}
    	return dummy;
    }
}

