class majorityElement {
    public int solution(int[] nums) {
    	int count = 0;
    	int a = nums[0];
    	for (int i = 0; i < nums.length; i++) {
    		if (nums[i] == a) {
    			count = count + 1;
    		}
    		else {
    			if (count > 0) {
    				count = count -1;
    			}
    			if (count == 0) {
    				a = nums[i];
    				count = count + 1;
    			}
    		}
    	}
    	return a;
    }

    public static void main(String[] argvs) {
    	majorityElement obj = new majorityElement();
    	int[] nums = {2,2,1,1,1,2,2};
    	int res = obj.solution(nums);
    	System.out.println(res);
    }
}