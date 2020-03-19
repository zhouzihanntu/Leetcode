import java.util.*;

class majorityElement {
    public List<Integer> solution(int[] nums){
    	int maj1 = 0;
    	int maj2 = 0;
    	int cnt1 = 0;
    	int cnt2 = 0;
    	int len = nums.length;

    	for(int i = 0; i < len; i++){
    		if (nums[i] == maj1){
    			cnt1 = cnt1 + 1;
    			continue;
    		}
    		if(nums[i] == maj2){
    			cnt2 = cnt2 + 1;
    			continue;
    		}
    		if(cnt1 == 0){
    			maj1 = nums[i];
    			cnt1 = cnt1 + 1;
    			continue;
    		}
    		if(cnt2 == 0){
    			maj2 = nums[i];
    			cnt2 = cnt2 + 1;
    			continue;
    		}
    		cnt1 = cnt1 - 1;
    		cnt2 = cnt2 - 1;
    	}

    	cnt1 = 0;
    	cnt2 = 0;
    	for (int i = 0; i < len; i++) {
    		if (nums[i] == maj1) {
    			cnt1 = cnt1 + 1;
    		}
    		else if (nums[i] == maj2) {
    			cnt2 = cnt2 + 1;
    		}
    	}
    	System.out.println(maj1 + " " + maj2);
    	List<Integer> maj = new ArrayList<>();

    	if (cnt1 > len/3) {
    		maj.add(maj1);
    	}
    	if (cnt2 > len/3) {
    		maj.add(maj2);
    	}
    	
    	return maj;
    }

    public static void main(String[] argv){
    	majorityElement obj = new majorityElement();
    	int[] nums = {1,1,1,2,3,4,5,6};
    	List<Integer> res = obj.solution(nums);
    	for (int i=0; i < res.size(); i++){
    		System.out.print(res.get(i) + "-");
    	}
    	System.out.println(" ");
    }
}