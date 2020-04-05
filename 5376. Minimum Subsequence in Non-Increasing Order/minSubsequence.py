class minSubsequence:
    def solution(self, nums):
        total = sum(nums)
        sum1 = 0
        nums = sorted(nums, reverse = True)
        res = []
        for n in nums:
            sum1 = sum1 + n
            res.append(n)
            if sum1 > total - sum1:
                break
        return res

obj = minSubsequence()
arr = [4,4,7,6,7]
res = obj.solution(arr)
print(res)