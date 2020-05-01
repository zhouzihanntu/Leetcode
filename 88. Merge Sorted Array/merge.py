class merge:
    def solution(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        m = m - 1
        n = n - 1
        idx = len(nums1) - 1
        while m >= 0 and n >= 0:
            if nums1[m] <= nums2[n]:
                nums1[idx] = nums2[n]
                idx = idx - 1
                n = n - 1
            else:
                nums1[idx] = nums1[m]
                idx = idx - 1
                m = m - 1
        while m >= 0:
            nums1[idx] = nums1[m]
            idx = idx - 1
            m = m - 1
        while n >= 0:
            nums1[idx] = nums2[n]
            idx = idx - 1
            n = n - 1