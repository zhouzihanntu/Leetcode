class singleNumbers:
    def solution(self, nums: List[int]) -> List[int]:
        minNum = 10001
        maxNum = 1
        zeroCount = 0
        sum = 0
        for i in nums:
            if i == 0:
                zeroCount = zeroCount + 1
            minNum = min(minNum, i)
            maxNum = max(maxNum, i)
            sum = sum ^ i
        if zeroCount == 1:
            return [0, sum]
        
        low, high = minNum, maxNum
        while low <= high:
            mid = (low + high) / 2
            lowSum, highSum = 0, 0
            for i in nums:
                if i <= mid:
                    lowSum = lowSum ^ i
                else:
                    highSum = highSum ^i
            if lowSum != 0 and highSum != 0:
                return [lowSum, highSum]
            if lowSum == 0:
                low = mid
            else:
                high = mid
        return null