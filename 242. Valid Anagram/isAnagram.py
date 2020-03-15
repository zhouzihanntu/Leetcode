class isAnagram:
    def solution(self, s, t) -> bool:
        arr = [0]*26
        if len(s) != len(t):
        	return False
        for i in s:
            arr[ord(i)-ord('a')] = arr[ord(i)-ord('a')] + 1
        for i in t:
            arr[ord(i)-ord('a')] = arr[ord(i)-ord('a')] - 1
        for i in arr:
        	if i != 0:
        		return False
        return True

obj = isAnagram()
s = "anagram"
t = "nagaram"
res = obj.solution(s, t)
print(res)