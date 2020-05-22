class Solution:
    def longestPalindromeSubseq(self, s: str) -> int:
        if not s:
            return 0

        n = len(s)
        countPalindrome = [[0] * n for _ in range(n)]
        for i in range(n):
            countPalindrome[i][i] = 1
        
        for i in range(n - 2, -1, -1):
            for j in range(i + 1, n, 1):
                countPalindrome[i][j] = countPalindrome[i + 1][j - 1] + 2 if s[i] == s[j] else max(countPalindrome[i + 1][j], countPalindrome[i][j - 1])
        
        return countPalindrome[0][n - 1]