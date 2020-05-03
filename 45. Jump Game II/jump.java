class jump {
    public int solution(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }
        int res = 0, end = 0, maxPos = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            maxPos = Math.max(maxPos, i + nums[i]);
            if (i == end) {
                end = maxPos;
                res ++;
            }
        }
        return res;
    }
}