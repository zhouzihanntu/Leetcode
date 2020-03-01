import java.util.LinkedList;
class myStack {
    LinkedList<Integer> queue1 = new LinkedList<>();
    LinkedList<Integer> queue2 = new LinkedList<>();
    int top;
    /** Initialize your data structure here. */
    public myStack() {
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        if(queue1.isEmpty()){
            queue2.offer(x);
        }else{
            queue1.offer(x);
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(queue1.isEmpty()){
            while(queue2.size()>1){
                queue1.offer(queue2.poll());
            }
            top = queue2.poll();
        }else{
            while(queue1.size()>1){
                queue2.offer(queue1.poll());
            }
            top = queue1.poll();
        }
        return top;
    }
    
    /** Get the top element. */
    public int top() {
        if(queue1.isEmpty()){
            while(queue2.size()>1){
                queue1.offer(queue2.poll());
            }
            top = queue2.poll();
            queue1.offer(top);
        }else{
            while(queue1.size()>1){
                queue2.offer(queue1.poll());
            }
            top = queue1.poll();
            queue2.offer(top);
        }
        return top;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        if(queue1.isEmpty() && queue2.isEmpty()){
            return true;
        }
        return false;
    }

    public static void main(String[] argvs){
        myStack obj = new myStack();
        obj.push(1);
        obj.push(2);
        int param_2 = obj.pop();
        int param_3 = obj.top();
        boolean param_4 = obj.empty();
    }
}



 