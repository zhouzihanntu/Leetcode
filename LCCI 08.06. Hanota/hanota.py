class hanota:
    def solution(self, A, B, C):
        n = len(A)
        if n == 0:
            return
        self.move(n, A, B, C)

    def move(self, n, A, B, C):
        if n == 1:
            C.append(A[-1])
            A.pop()
            return
        self.move(n - 1, A, C, B)
        C.append(A[-1])
        A.pop()
        self.move(n - 1, B, A, C)

obj = hanota()
A = [2, 1, 0]
B = []
C = []
obj.solution(A, B, C)