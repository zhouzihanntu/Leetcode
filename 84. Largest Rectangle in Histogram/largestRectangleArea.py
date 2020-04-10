class largestRectangleArea:
    def solution(self, heights) -> int:
        stack = [-1]
        heights = heights + [0]
        res = 0
        for i in range(len(heights)):
            while stack[-1] != -1 and heights[stack[-1]] >= heights[i]:
                res = max(heights[stack.pop()] * (i - stack[-1] - 1), res)
            stack.append(i)
        return res


obj = largestRectangleArea()
arr = [9,0]
res = obj.solution(arr)
print(res)