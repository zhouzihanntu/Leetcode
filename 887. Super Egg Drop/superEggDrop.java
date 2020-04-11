class superEggDrop {
    public int solution(int K, int N) {
    	if (N == 1) {
    		return 1;
    	}
    	if (K == 1) {
    		return N;
    	}
    	int[][] dp = new int[N + 1][K + 1];
    	for (int i = 1; i < K + 1; i++) {
    		dp[1][i] = 1;
    	}
    	int res = -1;
    	for (int i = 2; i < N + 1; i++) {
    		for (int j = 1; j < K + 1; j ++) {
    			dp[i][j] = 1 + dp[i - 1][j - 1] + dp[i - 1][j];
    		}
    		if (dp[i][K] >= N) {
    			res = i;
    			break;
    		}
    	}
    	return res;
    }
}