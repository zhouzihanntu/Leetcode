class getMaxRepetitions:
    def solution(self, s1: str, n1: int, s2: str, n2: int) -> int:
        dp = []
        for i in range(len(s2)):
            start = i
            cnt = 0
            for j in range(len(s1)):
                if s1[j] == s2[start]:
                    start = start + 1
                    if start == len(s2):
                        start = 0
                        cnt = cnt + 1
            dp.append((start,cnt))
        res = 0
        next = 0
        for _ in range(n1):
            res = res + dp[next][1]
            next = dp[next][0]
        return res // n2

obj = getMaxRepetitions()
s1 ="acb"
n1 = 4
s2 ="ab"
n2 = 2
res = obj.solution(s1, n1, s2, n2)
print(res)