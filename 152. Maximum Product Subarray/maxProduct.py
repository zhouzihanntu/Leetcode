class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        maxRes = nums[0]
        iMin = 1
        iMax = 1
        for n in nums:
            if n < 0:
                iMin, iMax = iMax, iMin
            iMin = min(iMin * n, n)
            iMax = max(iMax * n, n)
            maxRes = max(maxRes, iMax)
        return maxRes