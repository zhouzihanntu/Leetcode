class canJump {
    public boolean solution(int[] nums) {
        int maxPosition = 0;
        for (int i = 0; i < nums.length; i ++) {
            if (i <= maxPosition) {
                maxPosition = Math.max(maxPosition, i + nums[i]);
            }
            if (maxPosition >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}