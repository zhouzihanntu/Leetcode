class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        fast = 0
        slow = 0
        while True:
            fast = nums[nums[fast]]
            slow = nums[slow]
            if slow == fast:
                fast = 0
                while nums[slow] != nums[fast]:
                    slow = nums[slow]
                    fast = nums[fast]
                return nums[slow]