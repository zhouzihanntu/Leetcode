class singleNumber:
    def solution(self, nums: List[int]) -> int:
        num = nums[0]
        for i in nums[1:]:
            num = num ^ i
        return num