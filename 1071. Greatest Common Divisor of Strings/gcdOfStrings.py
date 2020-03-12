class gcdOfStrings:
	def solution(self, str1, str2):
		if (str1 + str2 != str2 + str1):
			return ""
		a = len(str1)
		b = len(str2)
		mod = a % b
		while mod:
			a = b
			b = mod
			mod = a % b
		return str1[:b]


obj = gcdOfStrings()
str1 = "ABCABCABC"
str2 = "ABCABC"
res = obj.solution(str1, str2)
print(res)
