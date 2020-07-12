class Solution:
    def addBinary(self, a: str, b: str) -> str:
        arr1 = [(ord(i) - ord('0')) for i in a]
        arr2 = [(ord(i) - ord('0')) for i in b]
        if len(arr1) < len(arr2):
            arr1 = [0] * (len(arr2) - len(arr1)) + arr1
        if len(arr2) < len(arr1):
            arr2 = [0] * (len(arr1) - len(arr2)) + arr2
        
        n = len(arr1) + 1
        res = [''] * n
        carry = 0

        for i in range(n - 2, -1, -1):
            x = arr1[i]
            y = arr2[i]
            sum = x + y + carry
            if sum > 1:
                carry = 1
                res[i + 1] = chr(ord('0') + sum % 2);
            else:
                carry = 0
                res[i + 1] = chr(ord('0') + sum)


        if carry > 0:
            res[0] = chr(ord('0') + carry)
        return ''.join(res)
