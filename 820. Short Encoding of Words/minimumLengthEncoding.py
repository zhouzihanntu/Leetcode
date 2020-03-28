class minimumLengthEncoding:
    def solution(self, words) -> int:
        reversedWords = []
        for word in words:
            reversedWords.append(word[::-1])
        reversedWords.sort()
        res = 0
        N = len(reversedWords)
        for i in range(N):
            if i + 1 < N and reversedWords[i+1].startswith(reversedWords[i]):
                pass
            else:
                res = res + len(reversedWords[i]) + 1
        return res

obj = minimumLengthEncoding()
w = ["time", "me", "bell"]
res = obj.solution(w)
print(res)