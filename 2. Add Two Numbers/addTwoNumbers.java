class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class addTwoNumbers {
    public ListNode Solution(ListNode l1, ListNode l2) {
    	ListNode newNode = new ListNode(0);
    	ListNode iNode = newNode;
    	int carry = 0;
    	int x = 0;
    	int y = 0;
    	int sum = 0;
    	while(l1 != null || l2 != null){
    		x = (l1 != null) ? l1.val : 0;
    		y = (l2 != null) ? l2.val : 0;
    		sum = x + y + carry;
    		carry = sum / 10;

    		iNode.next = new ListNode(sum % 10);
    		iNode = iNode.next;

    		if(l1 != null){
    			l1 = l1.next;
    		}
    		if(l2 != null){
    			l2 = l2.next;
    		}
    	}
    		
    	if(carry > 0){
    		iNode.next = new ListNode(1);
    	}
    		
    	return newNode.next;
    }

    	
}

