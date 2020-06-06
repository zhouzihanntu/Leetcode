class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        map1 = {}
        max_length = 0
        for n in nums:
            if n not in map1:
                left = map1.get(n - 1, 0)
                right = map1.get(n + 1, 0)
                cur_length = left + right + 1

                max_length = max(max_length, cur_length)
                map1[n] = cur_length
                map1[n - left] = cur_length
                map1[n + right] = cur_length
        return max_length