class jump:
    def solution(self, nums: List[int]) -> int:
        if len(nums) < 1:
            return 0
        res = 0
        end = 0
        maxPos = 0
        for i in range(len(nums) - 1):
            maxPos = max(maxPos, nums[i] + i)
            if i == end:
                end = maxPos
                res = res + 1
        return res