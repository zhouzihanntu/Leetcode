class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class addTwoNumbers {
    public ListNode Solution(ListNode l1, ListNode l2) {
    	ListNode head = null;
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        int carry = 0;
        while(l1 != null) {
            stack1.push(l1.val);
            l1 = l1.next;
        }
        while(l2 != null) {
            stack2.push(l2.val);
            l2 = l2.next;
        }
        while(!stack1.isEmpty() || !stack2.isEmpty() || carry > 0){
            int sum = carry;
            sum = sum + ((!stack1.isEmpty()) ? stack1.pop() : 0);
            sum = sum + ((!stack2.isEmpty()) ? stack2.pop() : 0);
            carry = sum / 10;
            ListNode node = new ListNode(sum % 10);
            node.next = head;
            head = node;
        }
        return head;
    }

    	
}

