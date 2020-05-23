class Solution:
    def minWindow(self, s: str, t: str) -> str:
        left = 0
        right = 0
        size = len(s)
        need = {}
        window = {}
        start = 0
        length = size + 1
        valid = 0
        for c in t:
            if need.__contains__(c):
                need[c] += 1
            else:
                need[c] = 1

        while right < size:
            curr = s[right]
            right += 1
            if need.__contains__(curr):
                if window.__contains__(curr):
                    window[curr] += 1
                else:
                    window[curr] = 1
                if need[curr] == window[curr]:
                    valid += 1 
            
            while valid == len(need):
                if right - left < length:
                    start = left
                    length = right - left
                r = s[left]
                left += 1
                if need.__contains__(r):
                    if window[r] == need[r]:
                        valid -= 1
                    window[r] -= 1
        return "" if length == size + 1 else s[start:start + length]