class lastRemaining:
    def solution(self, n: int, m: int) -> int:
        p = 0
        for i in range(2,n+1):
        	p = (p + m) % i
        return p



obj = lastRemaining()
n = 5
m = 3
res = obj.solution(n, m)
print(res)
