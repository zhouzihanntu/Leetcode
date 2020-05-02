class lengthOfLongestSubstring:
    def solution(self, s: str) -> int:
        if len(s) == 0:
            return 0
        left = 0
        curCnt = 0
        maxCnt = 0
        charSet = set()
        for i in range(len(s)):
            curCnt = curCnt + 1
            while s[i] in charSet:
                charSet.remove(s[left])
                left = left + 1
                curCnt = curCnt - 1
            maxCnt = max(maxCnt, curCnt)
            charSet.add(s[i])
        return maxCnt
