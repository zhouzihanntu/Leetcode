class printNumbers:
    def __init__(self):
        self.result = []

    def solution(self, n):
        if n < 0:
            return []
        nums = ["0"] * n
        nums[-1] = 1
        for i in range(0, 10):
            nums[0] = chr(ord("0") + i)
            self.print1ToMax(nums, n, 0)
        return self.result[1:]

    def print1ToMax(self, nums, length, index):
        if index == length - 1:
            self.result.append(int("".join(nums)))
            return
        for i in range(0, 10):
            nums[index+1] = chr(ord("0") + i)
            self.print1ToMax(nums, length, index + 1)

obj = printNumbers()
res = obj.solution(3)
print(res)