class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        
        int maxLen = 0;
        for (String word: wordDict) {
            maxLen = Math.max(maxLen, word.length());
        }

        dp[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = Math.max(i - maxLen, 0); j < i; j++) {
                if (dp[j] == true && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }
}