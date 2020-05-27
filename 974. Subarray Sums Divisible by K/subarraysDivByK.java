class Solution {
    public int subarraysDivByK(int[] A, int K) {
        int sum = 0, ans = 0, mod;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int n: A) {
            sum += n;
            mod = (sum % K + K) % K;
            ans += map.getOrDefault(mod, 0);
            map.put(mod, map.getOrDefault(mod, 0) + 1);
        }
        return ans;
    }
}