class Solution:
    def findTheLongestSubstring(self, s: str) -> int:
        res = 0
        status = 0
        pos = [-2] * (1 << 5)
        pos[0] = -1
        for i, char in enumerate(s):
            if char == 'a':
                status ^= 1
            if char == 'e':
                status ^= 2
            if char == 'i':
                status ^= 4
            if char == 'o':
                status ^= 8
            if char == 'u':
                status ^= 16
            if pos[status] != -2:
                res = max(res, i - pos[status])
            else:
                pos[status] = i
        return res