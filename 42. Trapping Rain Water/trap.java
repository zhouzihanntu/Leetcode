import java.util.*;
class trap {
    public int solution(int[] height) {
    	Stack<Integer> stack = new Stack<>();
    	int res = 0;
    	for (int i = 0; i < height.length; i++) {
    		while(!stack.isEmpty() && height[stack.peek()] < height[i]) {
    			int temp = stack.pop();
    			while(!stack.isEmpty() && height[stack.peek()] == height[temp]) {
    				stack.pop();
    			}
    			if (!stack.isEmpty()) {
    				res = res + (Math.min(height[stack.peek()], height[i]) - height[temp]) * (i - stack.peek() - 1);
    			}
    		}
    		stack.push(i);
    	}
    	return res;
    }
    public static void main(String[] argv) {
    	int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
    	trap obj = new trap();
    	int res = obj.solution(arr);
    	System.out.println(res);
    }
}