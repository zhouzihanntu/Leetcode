class canJump:
    def solution(self, nums: List[int]) -> bool:
        maxJump = 0
        for i in range(len(nums)):
            if i <= maxJump:
                maxJump = max(maxJump, i + nums[i])
            if maxJump >= len(nums) - 1:
                return True
        return False