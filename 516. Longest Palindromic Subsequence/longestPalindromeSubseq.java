class Solution {
    /**
     * @param s: the maximum length of s is 1000
     * @return: the longest palindromic subsequence's length
     */
    public int longestPalindromeSubseq(String s) {
        // write your code here
        int n = s.length();
        if (n == 0) {
            return 0;
        }
        
        int[][] countPalindrome = new int[n][n];
        for (int i = 0; i < n; i++) {
            countPalindrome[i][i] = 1;
        }
        
        for (int i = n - 2; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                countPalindrome[i][j] = (s.charAt(i) == s.charAt(j)) ? countPalindrome[i + 1][j - 1] + 2 : Math.max(countPalindrome[i][j - 1], countPalindrome[i + 1][j]);
            }
        }
        
        return countPalindrome[0][n - 1];
    }
}