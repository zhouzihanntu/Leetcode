class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        length = len(strs)
        if length == 0:
            return ""
        if length == 1:
            return strs[0]
        strs.sort()
        for idx, x in enumerate(strs[0]):
            if x != strs[-1][idx]:
                return strs[-1][:idx]
        return strs[0]
        