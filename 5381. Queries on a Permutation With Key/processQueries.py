class Solution:
    def processQueries(self, queries: List[int], m: int) -> List[int]:
        res = []
        P = [i for i in range(1, m+1)]
        for i in range(len(queries)):
            res.append(P.index(queries[i]))
            P.remove(queries[i])
            P = [queries[i]] + P
        return res