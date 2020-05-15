class subarraySum:
    def solution(self, nums: List[int], k: int) -> int:
        sum = 0
        res = 0
        cul = {}
        cul[0] = 1
        for n in nums:
            sum += n
            if cul.__contains__(sum - k):
                res += cul[sum - k]
            if not cul.__contains__(sum):
                cul[sum] = 0
            cul[sum] += 1
        return res
            