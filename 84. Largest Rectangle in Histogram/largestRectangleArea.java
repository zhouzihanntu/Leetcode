import java.util.*;
class largestRectangleArea {
    public int solution(int[] heights) {
    	Stack<Integer> stack = new Stack<>();
    	int res = 0;
    	stack.push(-1);
    	for (int i = 0; i < heights.length; i++) {
    		while(stack.peek() != -1 && heights[stack.peek()] >= heights[i]) {
    			res = Math.max(heights[stack.pop()] * (i - stack.peek() - 1), res);
    		}
    		stack.push(i);
    	}

    	while(stack.peek() != -1) {
    		res = Math.max(heights[stack.pop()] * (heights.length - stack.peek() - 1), res);
    	}
    	return res;
    }
    public static void main(String[] argv) {
    	int[] arr = {9, 0};
    	largestRectangleArea obj = new largestRectangleArea();
    	int res = obj.solution(arr);
    	System.out.println(res);
    }
}