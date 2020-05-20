class Solution {
    public int findTheLongestSubstring(String s) {
        int[] pos = new int[1 << 5];
        Arrays.fill(pos, -2);
        int res = 0;
        int status = 0;
        pos[0] = -1;
        for (int i = 0; i < s.length(); i ++) {
            if (s.charAt(i) == 'a') {
                status ^= 1 << 0;
            }
            if (s.charAt(i) == 'e') {
                status ^= 1 << 1;
            }
            if (s.charAt(i) == 'i') {
                status ^= 1 << 2;
            }
            if (s.charAt(i) == 'o') {
                status ^= 1 << 3;
            }
            if (s.charAt(i) == 'u') {
                status ^= 1 << 4;
            }
            if (pos[status] != -2) {
                res = Math.max(res, i - pos[status]);
            } else {
                pos[status] = i;
            }
        }
        return res;
    }
}