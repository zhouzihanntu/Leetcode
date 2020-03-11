class canThreePartsEqualSum:
    def solution(self, A):
        sum = 0
        for a in A:
            sum = sum + a
        if (sum % 3):
        	return False
        avg = sum / 3
        count = 0
        sum1, sum2 = 0, 0
        for i in range(0, len(A) - 1):
        	sum1 = sum1 + A[i]
        	if (sum1 == avg):
        		sum1 = 0
        		count = count + 1
	        	if count == 2:
	        		return True
        return False

List1 = [0,2,1,-6,6,-7,9,1,2,0,1]
List2 = [0,2,1,-6,6,7,9,-1,2,0,1]
List3 = [3,3,6,5,-2,2,5,1,-9,4]
List4 = [1,-1,1,-1]
obj = canThreePartsEqualSum()
res = obj.solution(List4)
print(res)