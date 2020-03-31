import java.util.Arrays;
class sortArray {
    public int[] solution(int[] nums) {
    	int max = -50001;
    	int min = 50001;
    	for (int i : nums) {
    		max = Math.max(max, i);
    		min = Math.min(min, i);
    	}
    	int[] count = new int[max - min + 1];
    	for (int i : nums) {
    		count[i - min] = count[i - min] + 1;
    	}
    	int idx = 0;
    	for (int i = 0; i < count.length; i++) {
    		int cnt = count[i];
    		while (cnt != 0) {
    			nums[idx] = i + min;
    			idx = idx + 1;
    			cnt = cnt - 1;
    		}
    		
    	}
        return nums;
    }

    public void printArray(int[] arr) {
    	for (int i=0; i<arr.length; i++) {
    		System.out.print(arr[i] + " ");
    	}
    	System.out.println(" ");
    }

    public static void main(String[] argv) {
    	int[] num = {5,1,1,2,0,0};
    	sortArray obj = new sortArray();
    	obj.printArray(num);
    	int[] res = obj.solution(num);
    	obj.printArray(res);
    }
}