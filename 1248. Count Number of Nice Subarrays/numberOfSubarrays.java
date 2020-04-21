class numberOfSubarrays {
    public int solution(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int oddCnt = 0;
        int res = 0;
        while (right < nums.length) {
            if ((nums[right++] & 1) == 1) {
                oddCnt ++;
            }
            if (oddCnt == k) {
                int temp = right;
                while (right < nums.length && (nums[right] & 1) == 0) {
                    right ++;
                }
                int rightEvenCnt = right - temp;
                int leftEvenCnt = 0;
                while((nums[left] & 1) == 0) {
                    leftEvenCnt ++;
                    left ++;
                }
                res = res + (leftEvenCnt + 1) * (rightEvenCnt + 1);
                left ++;
                oddCnt --;
            }
        }
        return res;
    }
}