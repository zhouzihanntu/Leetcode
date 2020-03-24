class massage {
    public int solution(int[] nums) {
    	int ans = 0;
    	int n = nums.length;
    	if (n == 0) {
    		return ans;
    	}
    	else if (n == 1) {
    		return nums[0];
    	}
    	int[] dp = new int[n];
    	dp[0] = nums[0];
    	dp[1] = Math.max(nums[0], nums[1]);
    	for (int i = 2; i < n; i++) {
    		dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);
    	}
    	ans = dp[n-1];
    	return ans;
    }

    public static void main(String[] argv){
    	massage obj = new massage();
    	// int[] app = {2,1};
		// int[] app = {1,2,3,1};
		// int[] app = {2,7,9,3,1};
		int[] app = {2,1,4,5,3,1,1,3};
		int res = obj.solution(app);
		System.out.println(res);
    }
}