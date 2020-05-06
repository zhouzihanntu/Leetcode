class mincostTickets {
    public int solution(int[] days, int[] costs) {
        if (days.length == 0) {
            return 0;
        }
        int maxDay = days[days.length - 1];
        int[] dp = new int[maxDay + 1];
        int dayIdx = 0;
        int dp_7 = 0, dp_30 = 0;
        for (int i = 1; i < maxDay + 1; i ++) {
            if (i != days[dayIdx]) {
                dp[i] = dp[i - 1];
            }
            else {
                dp_7 = i - 7 < 0 ? 0 : dp[i - 7];
                dp_30 = i - 30 < 0 ? 0 : dp[i - 30];
                dp[i] = Math.min(dp[i - 1] + costs[0], Math.min(dp_7 + costs[1], dp_30 + costs[2]));
                dayIdx ++;
            }
        }
        return dp[maxDay];
    }
}