class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int line = triangle.size();
        if (line == 0) {
            return 0;
        }
        int maxWidth = triangle.get(line - 1).size();
        if (maxWidth == 0) {
            return 0;
        }

        int[] dp = new int[maxWidth];
        for (int i = 0; i < maxWidth - 1; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[maxWidth - 1] = triangle.get(0).get(0);

        for (int i = 1; i < triangle.size(); i++) {
            int j = maxWidth - 1 - i;
            while (j < maxWidth) {
                int temp = dp[j];
                if (j == maxWidth - 1) {
                    dp[j] = temp + triangle.get(i).get(j - (maxWidth - 1 - i));
                    j++;
                    continue;
                }
                dp[j] = Math.min(temp, dp[j + 1]) + triangle.get(i).get(j - (maxWidth - 1 - i));
                j++;
            }
        }
        
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < maxWidth; i++) {
            res = Math.min(res, dp[i]);
        }
        return res;
    }
}