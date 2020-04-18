class maxArea:
    def solution(self, height) -> int:
        l, r = 0, len(height) - 1
        ans = 0
        while l < r:
            ans = max(ans, min(height[l], height[r]) * (r - l))
            if height[l] > height[r]:
                r = r - 1
            else:
                l = l + 1
        return ans


obj = maxArea()
arr = [1,8,6,2,5,4,8,3,7]
res = obj.solution(arr)
print(res)