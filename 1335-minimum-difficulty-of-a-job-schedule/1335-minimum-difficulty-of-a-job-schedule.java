class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
        int n = jobDifficulty.length;
    if (d > n)  return -1;
    int[][] dp = new int[d + 1][n + 1];

  
    for (int i = 0; i <= d; i++) {
       Arrays.fill(dp[i], Integer.MAX_VALUE);
    }
    dp[0][0] = 0;
    for (int day = 1; day <= d; day++) {
        for (int task = day; task <= n; task++) {
            int localMax = jobDifficulty[task-1];
            for (int s = task; s >= day; s--) {
                localMax = Math.max(localMax, jobDifficulty[s-1]);

                if (dp[day-1][s-1] != Integer.MAX_VALUE) { // 注意越界
                    dp[day][task] = Math.min(dp[day][task], dp[day-1][s-1] + localMax);
                }

            }
        }
    }

    return dp[d][n];
    }
}