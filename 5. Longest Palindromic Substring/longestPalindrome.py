class Solution:
    def longestPalindrome(self, s):
        # write your code here
        if not s:
            return s
            
        ans = ""
        for mid in range(len(s)):
            longest = self.getPalindrome(s, mid, mid)
            ans = longest if len(longest) > len(ans) else ans
            longest = self.getPalindrome(s, mid, mid + 1)
            ans = longest if len(longest) > len(ans) else ans
        return ans
    
    def getPalindrome(self, s, left, right):
        while left >= 0 and right < len(s) and s[left] == s[right]:
            left -= 1
            right += 1
        return s[left + 1: right]