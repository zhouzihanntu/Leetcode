class reverseWords:
    def solution(self, s: str) -> str:
        word = s.split()
        str1 = " ".join(word[::-1])
        return str1