import java.util.Deque;
import java.util.ArrayDeque;

class maxSlidingWindow {
    public int[] solution(int[] nums, int k) {
    	int[] res = new int[nums.length - k + 1];
    	if ( k == 0 ) {
    		return res;
    	}
    	else if ( k == 1 ) {
    		return nums;
    	}
    	ArrayDeque<Integer> queue = new ArrayDeque<>();
    	for (int i = 0; i < nums.length; i++) {
    		while (!queue.isEmpty() && nums[queue.peekLast()] <= nums[i]) {
    			queue.pollLast();
    		}
    		queue.offerLast(i);
    		if (queue.peekFirst() == i - k) {
    			queue.pollFirst();
    		}
    		if (i - k + 1 >= 0) {
    			res[i-k+1] = nums[queue.peekFirst()];
    		}
    	}
    	return res;
    }

    public static void main(String[] argv) {
    	maxSlidingWindow obj = new maxSlidingWindow();
    	int k = 3;
    	int[] arr = {1,3,-1,-3,5,3,6,7};
    	int[] winres = obj.solution(arr, k);
    	for (int i=0; i<winres.length; i++) {
    		System.out.print(winres[i] + " ");
    	}
    	System.out.println(' ');
    }
}