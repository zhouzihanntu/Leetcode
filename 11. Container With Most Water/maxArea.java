class maxArea {
    public int solution(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int res = 0;
        while (l < r) {
            int area = Math.min(height[l], height[r]) * (r - l);
            res = Math.max(res, area);
            if (height[l] > height[r]) {
                r --;
            }
            else {
                l ++;
            }
        }
        return res;
    }
}