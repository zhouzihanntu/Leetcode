class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
    	val = x;
    }
}

public class reverseKGroup {
    public ListNode solution(ListNode head, int k) {
        int count = 0;
        int countReverse = 0;
    	ListNode check = head;
        ListNode curr = head;
    	ListNode dummy = null;
        while(count < k && check != null){
            check = check.next;
            count = count + 1;
        }
        System.out.println(head);
        if (count == k){

            ListNode nextTemp = null;
            while(countReverse < k && curr != null){
                nextTemp = curr.next;
                curr.next = dummy;
                dummy = curr;
                curr = nextTemp;
                countReverse = countReverse + 1;
            }
            if (nextTemp != null){
                head.next = solution(nextTemp, k);
            }
            return dummy;
        }
        else {
            return head;
        }
    	
    }

    public static void main(String[] argv){
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

        int k = 2;
        reverseKGroup obj = new reverseKGroup();
        ListNode res = obj.solution(head, k);
        System.out.println(res);
        while(res != null){
            System.out.print(res.val + "->");
            res = res.next;
        }
        System.out.println(" ");
    }
}

