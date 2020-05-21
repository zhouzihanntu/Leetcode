class Solution {
    public String longestPalindrome(String s) {
        // write your code here
        if (s.length() <= 1) {
            return s;
        }
        
        int n = s.length();
        boolean[][] isPalindrome = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            isPalindrome[i][i] = true;
            if (i > 0) {
                isPalindrome[i][i - 1] = true;
            }
        }
        
        int start = 0, longest = 1;
        for (int length = 2; length <= n; length++) {
            for (int i = 0; i + length <= n; i++) {
                int j = i + length - 1;
                isPalindrome[i][j] = isPalindrome[i + 1][j - 1] && s.charAt(i) == s.charAt(j);
                if (isPalindrome[i][j] && longest < j - i + 1) {
                    start = i;
                    longest = j - i + 1;
                }
            }
        }
        return s.substring(start, start + longest);
    }
}