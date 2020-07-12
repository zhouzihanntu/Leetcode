class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        if (m == 0) {
            return 0;
        }
        int n = dungeon[0].length;
        if (n == 0) {
            return 0;
        }

        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i < m + 1; i++) {
            dp[i][n] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < n + 1; i++) {
            dp[m][i] = Integer.MAX_VALUE;
        }

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (i == m - 1 && j == n - 1) {
                    dp[m - 1][n - 1] = (dungeon[i][j] >= 0) ? 1 : 1 - dungeon[m - 1][n - 1];
                    continue;
                }
                if (dungeon[i][j] >= 0) {
                    dp[i][j] = Math.max(1, Math.min(dp[i + 1][j], dp[i][j + 1]) - dungeon[i][j]);  
                } else {
                    dp[i][j] = Math.min(dp[i + 1][j], dp[i][j + 1]) - dungeon[i][j];
                }
            }
        }

        return dp[0][0];
    }
}