class myPow:
    def solution(self, x: float, n: int) -> float:
        if x == 0 and n == 0:
            return 1
        if x == 0:
            return 0
        if x > 0 or (x < 0 and n % 2 == 0):
            return exp(n * log(abs(x)))
        else:
            return -exp(n * log(abs(x)))