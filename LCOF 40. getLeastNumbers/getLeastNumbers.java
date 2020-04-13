import java.util.*;

class getLeastNumbers {
    public int[] solution(int[] arr, int k) {
    	int[] count = new int[10000];
    	for (int i = 0; i < arr.length; i++) {
    		count[arr[i]] = count[arr[i]] + 1;
    	}
    	int[] sortedArr = new int[arr.length];
    	int index = 0;
    	for (int i = 0; i < arr.length; i++) {
    		while (count[i] > 0) {
    			sortedArr[index] = i;
    			index = index + 1;
    			count[i] = count[i] - 1;
    		}
    	}
    	return Arrays.copyOfRange(sortedArr, 0, k);
    }

    public static void main(String[] argv) {
    	getLeastNumbers obj = new getLeastNumbers();
    	int[] arr = {0,1,2,1};
    	int k = 2;
    	int[] res = obj.solution(arr, k);
    	for (int i = 0; i < res.length; i++) {
    		System.out.print(res[i] + " ");
    	}
    	System.out.println(" ");
    }
}