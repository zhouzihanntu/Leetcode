class Solution:
    def numWays(self, n: int, relation, k: int) -> int:
        dict = [[]] * n
        for r in relation:
            dict[r[0]] = dict[r[0]] + [r[1]]
        self.count = 0
        self.dfs(0, dict, n, k)
        return self.count
    
    def dfs(self, start, dict, n, k):
        if k == 0:
            if start == n - 1:
                self.count = self.count + 1
            return
        for i in dict[start]:
            self.dfs(i, dict, n, k - 1)
        
    
                
obj = Solution()
n = 5
arr = [[0,2],[2,1],[3,4],[2,3],[1,4],[2,0],[0,4]]
k = 3
res = obj.numWays(n, arr, k)
print(res)