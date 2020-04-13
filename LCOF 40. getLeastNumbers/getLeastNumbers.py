class getLeastNumbers:
    def solution(self, arr, k):
        count = [0]*10000
        for i in arr:
            count[i] = count[i] + 1
        sortedArr = []
        for idx, item in enumerate(count):
            while item:
                sortedArr.append(idx)
                item = item - 1
        return sortedArr[0:k]

obj = getLeastNumbers()
arr = [0,1,2,1]
k = 2
res = obj.solution(arr, k)
print(res)