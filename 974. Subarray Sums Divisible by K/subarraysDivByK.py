class Solution:
    def subarraysDivByK(self, A: List[int], K: int) -> int:
        ans = 0
        sumA = 0
        hashmap = {}
        hashmap[0] = 1
        for n in A:
            sumA += n
            mod = (sumA % K + K) % K
            if not hashmap.__contains__(mod):
                hashmap[mod] = 0
            ans += hashmap[mod]
            hashmap[mod] += 1
        return ans
