class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        if not candies:
            return []
        maxNum = candies[0]
        res = []
        for n in candies:
            maxNum = max(maxNum, n)
        for n in candies:
            if n + extraCandies >= maxNum:
                res.append(True)
            else:
                res.append(False)
        return res