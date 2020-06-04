class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        length = len(nums)
        ans = [0] * length
        
        for i in range(length):
            if i == 0:
                ans[i] = 1
            else:
                ans[i] = ans[i - 1] * nums[i - 1]
        
        rightProduct = 1
        for i in range(length - 2, -1, -1):
            rightProduct *= nums[i + 1]
            ans[i] *= rightProduct
        
        return ans