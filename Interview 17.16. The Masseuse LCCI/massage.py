class massage:
    def solution(self, nums) -> int:
        n = len(nums)
        if n == 0:
            return 0
        elif n == 1:
            return nums[0]
        dp = [0] * n
        dp[0] = nums[0]
        dp[1] = max(nums[0], nums[1])
        for i in range(2,n):
            dp[i] = max(dp[i-1], dp[i-2] + nums[i])
        return dp[-1]

app = [2,1]
#app = [1,2,3,1]
#app = [2,7,9,3,1]
#app = [2,1,4,5,3,1,1,3]
obj = massage()
res = obj.solution(app)
print(res)