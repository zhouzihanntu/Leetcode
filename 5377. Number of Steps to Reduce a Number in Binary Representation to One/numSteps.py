class Solution:
    def numSteps(self, s: str) -> int:
        s = int(s, 2)
        count = 0
        while s != 1:
            if s & 1:
                s = s + 1
            else:
                s = s >> 1
            count = count + 1
        return count