class Solution:
    def decodeString(self, s: str) -> str:
        stack = []
        num = 0
        res = ""
        for c in s:
            if c >= '0' and c <= '9':
                num = num * 10 + int(c)
            elif c == '[':
                stack.append((res, num))
                num = 0
                res = ""
            elif c == ']':
                top = stack.pop()
                res = top[0] + res * top[1]
            else:
                res += c
        return res