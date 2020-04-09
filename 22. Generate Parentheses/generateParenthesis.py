class generateParenthesis:
    def __init__(self):
        self.res = []
        
    def solution(self, n: int):
        self.dfs(n, n, "")
        return self.res
    
    def dfs(self, left, right, str):
        if left == 0 and right == 0:
            self.res.append(str)
            return
        if left > 0:
            self.dfs(left - 1, right, str + "(")
        if right > left:
            self.dfs(left, right - 1, str + ")")

obj = generateParenthesis()
res = obj.solution(3)
print(res)