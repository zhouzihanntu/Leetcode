from collections import deque
class maxSlidingWindow:
    def solution(self, nums, k):
        if k == 0:
            return []
        if k == 1:
            return nums
        que = []
        ans = []
        for i in range(0, len(nums)):
            while que and nums[que[-1]] <= nums[i]:
                que.pop()
            que.append(i)
            if que[0] <= i-k:
                que = que[1:]
            ans.append(nums[que[0]])
        return ans[k-1:]

#nums = [1,3,-1,-3,5,3,6,7]
nums = [7,2,4]
k = 2
obj = maxSlidingWindow()
res = obj.solution(nums, k)
print(res)
