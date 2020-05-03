class maxSubArray:
    def solution(self, nums: List[int]) -> int:
        sum = 0
        res = nums[0]
        for n in nums:
            if sum > 0:
                sum = sum + n
            else:
                sum = n
            res = max(sum, res)
        return res