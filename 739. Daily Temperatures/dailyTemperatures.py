class dailyTemperatures:
    def solution(self, T):
        n = len(T)
        ans = [0] * n
        stack = []
        for i in range(0, n):
            while stack and stack[-1][0] < T[i]:
                temp = stack.pop()
                ans[temp[1]] = i - temp[1]
            if stack and stack[-1][0] >= T[i]:
                stack.append((T[i], i))
            if not stack:
                stack.append((T[i], i))
        return ans

#temperatures = [73, 74, 75, 71, 69, 72, 76, 73]
temperatures = [89,62,70,58,47,47,46,76,100,70]
obj = dailyTemperatures()
res = obj.solution(temperatures)
print(res)