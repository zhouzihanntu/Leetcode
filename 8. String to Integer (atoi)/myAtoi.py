import re
class myAtoi:
    def solution(self, str: str) -> int:
        str = str.strip()
        if not str:
            return 0
        res = re.compile(r'^[\-\+]?\d+').findall(str)
        ans =  int(res[0]) if res else 0
        if ans > 0:
            ans = min(ans, 2147483647)
        elif ans < 0:
            ans = max(ans, -2147483648)
        return ans

obj = myAtoi()
string = "-91283472332"
res = obj.solution(string)
print(res)