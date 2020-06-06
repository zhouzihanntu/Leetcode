class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max_length = 0;
        for (int n: nums) {
            if (!map.containsKey(n)) {
                int left = map.getOrDefault(n - 1, 0);
                int right = map.getOrDefault(n + 1, 0);
                int cur_length = left + right + 1;
                max_length = Math.max(cur_length, max_length);

                map.put(n, cur_length);
                map.put(n - left, cur_length);
                map.put(n + right, cur_length);
            }
        }
        return max_length;
    }
}