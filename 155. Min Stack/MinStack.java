class MinStack {
    Stack<Integer> stk = new Stack<Integer>();
    Stack<Integer> minValue = new Stack<Integer>();
    /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int x) {
        stk.push(x);
        if (minValue.empty()) {
            minValue.push(x);
        }
        else {
            if (x <= minValue.peek()) {
                minValue.push(x);
            }
        }
    }
    
    public void pop() {
        if (!stk.empty()) {
            int temp = stk.pop();
            if (temp == minValue.peek()) {
                minValue.pop();
            }
        }
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return minValue.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */