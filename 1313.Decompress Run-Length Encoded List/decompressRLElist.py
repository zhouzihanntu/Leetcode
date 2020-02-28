class decompressRLElist:
    def decompressRLElist(self, nums):
        result = []
        for i in range(0, len(nums), 2):
            result = result + ( nums[i] * [nums[i+1]] )
        return result

test = decompressRLElist()
nums = [1,2,3,4]
result = test.decompressRLElist(nums)
print(result)