class hasGroupsSizeX:
    def solution(self, deck) -> bool:
        counter = [0]*10000
        for d in deck:
            counter[d] = counter[d] + 1
        x = 0
        for i in counter:
            if i > 0:
                x = self.gcd(x, i)
            if x == 1:
                return False
        return True
    def gcd(self, a, b):
        mod = a % b
        while mod:
            a = b
            b = mod
            mod = a % b
        return b
        
arr = [1,1,1,2,2,2,3,3]
# arr = [1,2,3,4,4,3,2,1]
obj = hasGroupsSizeX()
res = obj.solution(arr)
print(res)