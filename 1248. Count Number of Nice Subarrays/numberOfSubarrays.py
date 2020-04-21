class numberOfSubarrays:
    def solution(self, nums, k: int) -> int:
        even = [0]
        res = 0
        for i in nums:
            if i & 1:
                even.append(0)
            else:
                even[-1] = even[-1] + 1
        for i in range(k, len(even)):
            res = res + (even[i - k] + 1) * (even[i] + 1)
        return res


obj = numberOfSubarrays()
nums = [1,1,2,1,1]
k = 3
res = obj.solution(nums, k)
print(res)