class findContinuousSequence:
    def solution(self, target: int) -> List[List[int]]:
        res = []
        for n in range(2, target + 1):
            temp = target - (n * (n - 1) // 2)
            if temp <= 0:
                break
            if temp % n == 0:
                a1 = temp // n
                res.append([a1 + i for i in range(0, n)])
        return res[::-1]