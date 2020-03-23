
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
    	val = x;
    }
}

class middleNode {
    public ListNode solution(ListNode head) {
    	ListNode p1 = head;
    	ListNode p2 = head;
    	Boolean p2Forward = true;
    	while(p1 != null){
    		p1 = p1.next;
    		p2Forward = !p2Forward;
    		if( p2Forward ){
    			p2 = p2.next;
    		}
    	}
    	return p2;
    }

    public static void main(String[] argv) {
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);

        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ListNode head = node;

        while(node != null){
            System.out.print(node.val + "->");
            node = node.next;
        }
        System.out.println(" ");

        middleNode obj = new middleNode();
        ListNode res = obj.solution(head);
        System.out.println(res);
        while(res != null){
            System.out.print(res.val + "->");
            res = res.next;
        }
        System.out.println(" ");
    }

}