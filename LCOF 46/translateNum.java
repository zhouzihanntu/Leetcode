class Solution {
    public int translateNum(int num) {
        String strNum = String.valueOf(num);
        int len = strNum.length();
        if (len == 1) {
            return 1;
        }

        int[] dp = new int[len + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 1; i < len; i++) {
            int preSum = (strNum.charAt(i - 1) - '0') * 10 + (strNum.charAt(i) - '0');
            if (preSum < 26 && preSum != (strNum.charAt(i) - '0')) {
                dp[i + 1] = dp[i] + dp[i - 1];
            } else {
                dp[i + 1] = dp[i];
            }
        }
        return dp[len];
    }
}