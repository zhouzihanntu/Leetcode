class merge {
    public void solution(int[] nums1, int m, int[] nums2, int n) {
        m = m - 1;
        n = n - 1;
        int idx = nums1.length - 1;
        while (m >= 0 && n >= 0) {
            if (nums1[m] <= nums2[n]) {
                nums1[idx] = nums2[n];
                idx --;
                n --;
            }
            else {
                nums1[idx] = nums1[m];
                idx --;
                m --;
            }
        }
        while (m >= 0) {
            nums1[idx] = nums1[m];
            idx --;
            m --;
        }
        while (n >= 0) {
            nums1[idx] = nums2[n];
            idx --;
            n --;
        }
    }
}