class Solution:
    def isPalindrome(self, s: str) -> bool:
        if len(s) == 0:
            return True
        charArr = []
        for i in s:
            if ord(i) >= ord('0') and ord(i) <= ord('9'):
                charArr.append(i)
            if ord(i) >= ord('A') and ord(i) <= ord('Z'):
                charArr.append(chr(ord(i) + 32))
            if ord(i) >= ord('a') and ord(i) <= ord('z'):
                charArr.append(i)
        left = 0
        right = len(charArr) - 1
        while left < right:
            if charArr[left] == charArr[right]:
                left = left + 1
                right = right - 1
            else:
                return False
        return True