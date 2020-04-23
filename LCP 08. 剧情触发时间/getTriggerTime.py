class Solution:
    def getTriggerTime(self, increase, requirements):
        a = [0 for i in range(3)]
        requirements = [x + [i] for i, x in enumerate(requirements)]
        s = [sorted(requirements, key=lambda x: x[i]) for i in range(3)]
        index = [0 for i in range(3)]
        n = len(requirements)
        trigger = [0 for i in range(n)]
        ans = [-1 for i in range(n)]
        for d, (na,nb,nc) in enumerate(increase):
            a[0] += na; a[1] += nb; a[2] += nc
            for i in range(3):
                while index[i] < n and a[i] >= s[i][index[i]][i]:
                    trigger[s[i][index[i]][-1]] += 1
                    if trigger[s[i][index[i]][-1]] == 3:
                        ans[s[i][index[i]][-1]] = d + 1
                    index[i] += 1
        for i, (na, nb, nc, _) in enumerate(requirements):
            if na == 0 and nb == 0 and nc == 0:
                ans[_] = 0
        return ans



obj = Solution()
# increase = [[2,8,4],[2,5,0],[10,9,8]]
# requirements = [[2,11,3],[2,7,3],[2,7,1],[15,10,7],[9,17,12],[8,1,14]]
# increase = [[1,1,1]] 
# requirements = [[0,0,0]]
increase = [[0,4,5],[4,8,8],[8,6,1],[10,10,0]] 
requirements = [[12,11,16],[20,2,6],[9,2,6],[10,18,3],[8,14,9]]
res = obj.getTriggerTime(increase, requirements)
print(res)