import queue

class MyStack:
    def __init__(self):
        self.q1 = queue.Queue()
        self.q2 = queue.Queue()

    def push(self, x: int) -> None:
        self.q1.put(x)

    def pop(self) -> int:
        if self.q1.empty():
            return None
        else:
            while self.q1.qsize() > 1:
                self.q2.put(self.q1.get())
            res = self.q1.get()
            while self.q2.qsize():
                self.q1.put(self.q2.get())
            return res

    def top(self) -> int:
        if self.q1.empty():
            return None
        else:
            while self.q1.qsize() > 1:
                self.q2.put(self.q1.get())
            res = self.q1.get()
            while self.q2.qsize():
                self.q1.put(self.q2.get())
            self.q1.put(res)
            return res

    def empty(self) -> bool:
        if self.q1.empty():
            return True
        return False


# Your MyStack object will be instantiated and called as such:
obj = MyStack()
obj.push(1)
obj.push(2)
obj.push(3)
obj.push(4)
param_2 = obj.pop()
print(param_2)
param_3 = obj.top()
print(param_3)
param_4 = obj.empty()
print(param_4)