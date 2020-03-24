class isValid:
    def solution(self, s: str) -> bool:
        valid = True
        stack = []
        idx = 0
        a = len(s)
        while valid and idx < len(s):
            if s[idx] in ['{', '[', '(']:
                print(s[idx])
                stack.append(s[idx])
            else:
                if stack:
                    temp = stack.pop()
                    if s[idx] == ')' and temp == '(':
                        pass
                    elif s[idx] == ']' and temp == '[':
                        pass
                    elif s[idx] == '}' and temp == '{':
                        pass
                    else:
                        valid = False
                else:
                    valid = False
            idx = idx + 1
        if stack:
            valid = False
        return valid

obj = isValid()
string = "(){}[]]"
res = obj.solution(string)
print(res)