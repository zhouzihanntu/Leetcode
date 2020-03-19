class majorityElement:
    def solution(self, nums):
        maj = []
        maj1, maj2 = 0, 0
        cnt1, cnt2 = 0, 0
        length = len(nums)
        for i in nums:
            if i == maj1:
                cnt1 = cnt1 + 1
                continue
            if i == maj2:
                cnt2 = cnt2 + 1
                continue
            if cnt1 == 0:
                maj1 = i
                cnt1 = cnt1 + 1
                continue
            if cnt2 == 0:
                maj2 = i
                cnt2 = cnt2 + 1
                continue
            cnt1 = cnt1 - 1
            cnt2 = cnt2 - 1

        cnt1, cnt2 = 0, 0
        for i in nums:
            if i == maj1:
                cnt1 = cnt1 + 1
            elif i == maj2:
                cnt2 = cnt2 + 1

        if cnt1 > length/3:
            maj.append(maj1)
        if cnt2 > length/3:
            maj.append(maj2)

        return maj

obj = majorityElement()
#nums = [3,2,3]
nums = [1,1,1,3,3,2,2,2]
res = obj.solution(nums)
print(res)