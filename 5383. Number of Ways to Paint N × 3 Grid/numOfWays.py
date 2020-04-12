class Solution:
    def numOfWays(self, n: int) -> int:
        aba = 6
        abc = 6
        for _ in range(1, n):
            aba, abc= aba * 3 + abc * 2, aba * 2 + abc * 2
        return (aba + abc) % (10 ** 9 + 7)

