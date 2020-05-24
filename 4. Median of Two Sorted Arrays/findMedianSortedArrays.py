class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        len1 = len(nums1)
        len2 = len(nums2)
        left = (len1 + len2 + 1) // 2
        right = (len1 + len2 + 2) // 2
        return (self.getKth(nums1, 0, len1 - 1, nums2, 0, len2 - 1, left) + self.getKth(nums1, 0, len1 - 1, nums2, 0, len2 - 1, right)) / 2
    
    def getKth(self, nums1, start1, end1, nums2, start2, end2, k):
        len1 = end1 - start1 + 1
        len2 = end2 - start2 + 1

        if len1 > len2:
            return self.getKth(nums2, start2, end2, nums1, start1, end1, k)
        if len1 == 0:
            return nums2[start2 + k - 1]
        
        if k == 1:
            return min(nums1[start1], nums2[start2])

        i = start1 + min(len1, k // 2) - 1
        j = start2 + min(len2, k // 2) - 1
        if nums1[i] < nums2[j]:
            return self.getKth(nums1, i + 1, end1, nums2, start2, end2, k - (i - start1 + 1))
        else:
            return self.getKth(nums1, start1, end1, nums2, j + 1, end2, k - (j - start2 + 1))
        