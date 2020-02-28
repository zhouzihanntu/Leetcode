class NSRNZ:
    def Solution(self, num):
        count = 0
        while num:
            if num & 1:
                num = num ^ 1
            else:
                num = num >> 1
            count = count + 1
        return count

test = NSRNZ()
num = 123
step = test.Solution(num)