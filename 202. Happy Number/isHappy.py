class isHappy:
    def check(self, n, happySet):
        if n in happySet:
            return False
        happySum = 0
        happySet.add(n)
        while n > 0:
            x = n % 10
            n = n // 10
            happySum = happySum + x * x
        if happySum == 1:
            return True
        return self.check(happySum, happySet)

    def solution(self, n: int) -> bool:
        happySet = set()
        return self.check(n, happySet)