class maxDepthAfterSplit:
    def solution(self, seq: str):
        result = [0] * len(seq)
        for i in range(0, len(result)):
            if seq[i] == seq[i-1]:
                result[i]=1-result[i-1]
            else:
                result[i]=result[i-1]
        return result

obj = maxDepthAfterSplit()
string = "(()())"
res = obj.solution(string)
print(res)