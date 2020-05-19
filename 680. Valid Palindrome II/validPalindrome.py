class Solution:
    def validPalindrome(self, s: str) -> bool:
        left = 0
        right = len(s) - 1
        if left >= right:
            return True
        while left < right:
            if s[left] != s[right]:
                return self.isPalindrome(s, left + 1, right) or self.isPalindrome(s, left, right - 1)
            left += 1
            right -= 1
        return True

    def isPalindrome(self, s, left, right):
        if left >= right:
            return True
        if s[left] == s[right]:
            return self.isPalindrome(s, left + 1, right - 1)
        else:
            return False