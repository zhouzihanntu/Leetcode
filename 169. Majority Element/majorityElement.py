class majorityElement:
    def solution(self, nums) -> int:
        ele = nums[0]
        count = 0
        for i in nums:
            if i == ele:
                count = count + 1
            else:
                if count > 0:
                    count = count - 1
                else:
                    ele = i
                    count = count + 1
        return ele

nums = [2,2,1,1,1,2,2]
obj = majorityElement()
a = obj.solution(nums)
print(a)