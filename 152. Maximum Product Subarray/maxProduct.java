class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE, iMin = 1, iMax = 1;
        for (int n: nums) {
            if (n < 0) {
                int temp = iMin;
                iMin = iMax;
                iMax = temp;
            }
            iMin = Math.min(iMin * n, n);
            iMax = Math.max(iMax * n, n);
            max = Math.max(max, iMax);
        }
        return max;
    }
}