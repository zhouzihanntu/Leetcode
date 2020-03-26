class numRookCaptures:
    def solution(self, board):
        count = 0
        row = 0
        col = 0
        for i in range(0,8):
            rowStr = ''.join(board[i])
            if rowStr.find('R') > 0:
                row = i
                col = rowStr.find('R')
                break
        rowStr = rowStr.replace('.', '')
        if 'pR' in rowStr:
            count = count + 1
        if 'Rp' in rowStr:
            count = count + 1
        colStr = ''.join(c[col] for c in board).replace('.', '')
        if 'pR' in colStr:
            count = count + 1
        if 'Rp' in colStr:
            count = count + 1
        return count


arr = [[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".","R",".",".",".","p"],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."]]
obj = numRookCaptures()
res = obj.solution(arr)
print(res)