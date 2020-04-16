class merge:
    def solution(self, intervals):
        intervals.sort()
        i = 0
        while i < len(intervals) - 1:
            if intervals[i][1] >= intervals[i + 1][0]:
                intervals[i][1] = max(intervals[i][1], intervals[i + 1][1])
                intervals.pop(i + 1)
            else:
                i = i + 1
        return intervals
        

arr = [[8,10],[1,3],[2,6],[15,18]]
obj = merge()
res = obj.solution(arr)
print(res)