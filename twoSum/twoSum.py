class twoSum:
    def Solution(self, nums, target):
        hashmap ={}
        for index, num in enumerate(nums):
            targetNum = target - num
            if hashmap.__contains__(targetNum):
                return [ hashmap[targetNum], index]
            hashmap[num] = index
        return []

arr = [5, 5, 11, 15]
target = 10
twoSum = twoSum()
result = twoSum.Solution(arr, target)
print(result)