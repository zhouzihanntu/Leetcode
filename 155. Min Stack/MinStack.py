class MinStack:
    def __init__(self):
        """
        initialize your data structure here.
        """
        self.stack = []
        self.minValue = []

    def push(self, x: int) -> None:
        self.stack.append(x)
        if not self.minValue:
            self.minValue.append(x)
        else:
            if x <= self.minValue[-1]:
                self.minValue.append(x)

    def pop(self) -> None:
        if self.stack:
            temp = self.stack.pop()
            if temp == self.minValue[-1]:
                self.minValue.pop()

    def top(self) -> int:
        return self.stack[-1] if len(self.stack) else None

    def getMin(self) -> int:
        return self.minValue[-1] if len(self.minValue) else None



# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(x)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()