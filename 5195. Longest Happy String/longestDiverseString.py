class longestDiverseString:
    def solution(self, a: int, b: int, c: int) -> str:
        arr = [[a, 'a'], [b, 'b'], [c, 'c']]
        res = ""

        while True:
            if len(arr) <= 1:
                return res
            for i in sorted(arr, reverse = True):
                if i[0] == 0:
                    arr.remove(i)
                    continue
                if len(res) >= 2 and res[-2:] == i[1] * 2:
                    continue
                res = res + i[1]
                i[0] = i[0] - 1
                break
        


obj = longestDiverseString()
a = 1
b = 1
c = 7
res = obj.solution(a, b, c)
print(res)
