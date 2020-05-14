class coinChange {
    int ans;
    public void change(int index, int[] coins, int count, int amount) {
        if (amount == 0) {
            ans =  Math.min(count, ans);
            return;
        }
        if (index < 0) {
            return;
        }
        int i = amount / coins[index];
        for (int k = i; k >= 0 && count + k < ans; k --) {
            change(index - 1, coins, count + k, amount - k * coins[index]);
        }

    }
    public int solution(int[] coins, int amount) {
        Arrays.sort(coins);
        ans = amount + 1;
        change(coins.length - 1, coins, 0, amount);
        return ans != amount + 1 ? ans : -1;
    }
}