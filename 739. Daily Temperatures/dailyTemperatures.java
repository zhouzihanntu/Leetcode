import java.util.Stack;

class dailyTemperatures {
    public int[] solution(int[] T) {
    	int[] ans = new int[T.length];
    	Stack<Integer> stack = new Stack<Integer>();
    	for (int i=0; i < T.length; i++) {
    		while (!stack.isEmpty() && T[stack.peek()] < T[i]) {
    			int temp = stack.pop();
    			ans[temp] = i - temp;
    		}
    		if (!stack.isEmpty() && T[stack.peek()] >= T[i]) {
    			stack.push(i);
    		}
    		else if (stack.isEmpty()) {
    			stack.push(i);
    		}
    	}
    	return ans;
    }

    public static void main(String[] argv) {
    	// int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
    	int[] temperatures = {89,62,70,58,47,47,46,76,100,70};
    	dailyTemperatures obj = new dailyTemperatures();
    	int[] res = obj.solution(temperatures);
    	for (int i=0; i < res.length; i++) {
    		System.out.print(res[i] + " ");
    	}
    	System.out.println(" ");
    }
}