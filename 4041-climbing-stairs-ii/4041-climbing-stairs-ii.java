class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        for(int j=1;j<=n;j++){
            dp[j]=Integer.MAX_VALUE;
        }

        for(int j=1;j<=n;j++){
            for(int step=1;step<=3;step++){
                int i = j - step;
                if(i>=0){
                    dp[j] = Math.min(dp[j], dp[i]+costs[j-1]+step*step);
                }
                
            }
        }
        return dp[n];
    }
}