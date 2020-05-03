class maxSubArray {
    public int solution(int[] nums) {
        int sum = 0, res = nums[0];
        for (int n: nums) {
            if (sum > 0) {
                sum = sum + n;
            }
            else {
                sum = n;
            }
            res = Math.max(sum, res);
        }
        return res;
    }
}