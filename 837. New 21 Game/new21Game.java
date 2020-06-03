class Solution {
    public double new21Game(int N, int K, int W) {
        double[] dp = new double[K + W];
        double sum = 0;
        for (int i = K; i < K + W; i++) {
            dp[i] = (i <= N) ? 1.0 : 0.0;
            sum += dp[i];
        }
        for (int i = K - 1; i > -1; i--) {
            dp[i] = sum / W;
            sum += dp[i] - dp[i + W];
        }
        return dp[0];
    }
}