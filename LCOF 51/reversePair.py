class reversePairs:
    def __init__(self):
        self.cnt = 0

    def merge(self, nums, start, mid, end, temp):
        i = start
        j = mid + 1
        while i <= mid and j <= end:
            if nums[i] <= nums[j]:
                temp.append(nums[i])
                i = i + 1
            else:
                self.cnt = self.cnt + mid - i + 1
                temp.append(nums[j])
                j = j + 1
        while i <= mid:
            temp.append(nums[i])
            i = i + 1
        while j <= end:
            temp.append(nums[j])
            j = j + 1
        for i in range(len(temp)):
            nums[start + i] = temp[i]
        temp.clear()

    def mergeSort(self, nums, start, end, temp):
        if start >= end:
            return
        mid = (start + end) >> 1
        self.mergeSort(nums, start, mid, temp)
        self.mergeSort(nums, mid + 1, end, temp)
        self.merge(nums, start, mid, end, temp)
    
    def solution(self, nums: List[int]) -> int:
        self.mergeSort(nums, 0, len(nums) - 1, [])
        return self.cnt