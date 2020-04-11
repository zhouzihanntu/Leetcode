class superEggDrop:
    def solution(self, K: int, N: int) -> int:
        if N == 1:
            return 1
        if K == 1:
            return N
        dp = [[0] * (K + 1) for i in range(0, N + 1)]
        # dp[i][j]：最多扔i次，有j个鸡蛋，可以检测的层数，扔的次数i必然小于总层数N
        for i in range(1, K + 1):
            dp[1][i] = 1
            # dp[1][i]：扔一次，不管有多少个鸡蛋，最坏情况都只能检测一层
        for i in range(2, N + 1):
            for j in range(1, K + 1):
                dp[i][j] = 1 + dp[i - 1][j - 1] + dp[i - 1][j] 
                # dp[i-1][j-1]：如果这一次扔的蛋碎了，这次的蛋白给，楼下的层数就是在这之前扔了i-1次用了j-1个蛋检测的层数
                # dp[i-1][j]：如果这次扔的蛋没碎，把当前这一层看作0层往上检测，能够检测到的楼上的层数等于蛋的数量不变，检测机会减少一次时能检测的层数，也就是dp[i-1][j]
                # +1：加上这一次扔的这一层
            if dp[i][K] >= N:
                return i

obj = superEggDrop()
K = 2
N = 7
res = obj.solution(K, N)
print(res)