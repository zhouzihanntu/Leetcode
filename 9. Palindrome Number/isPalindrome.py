class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False
        origin = x
        new = 0
        while x > 0:
            temp = x % 10
            new = new * 10 + temp
            x = (x - temp) // 10
        return origin == new 