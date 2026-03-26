// Last updated: 26/03/2026, 16:20:33
class Solution {
    public int coinChange(int[] c, int amt) {
        int[] dp=new int[amt+1];
        Arrays.fill(dp,amt+1);
        
        dp[0]=0;
        for(int i=1;i<=amt;i++)
        {
        
            for(int x:c)
            {
                if(i-x>=0)
                {
                
                
                dp[i]=Math.min(dp[i],dp[i-x]+1); }
            }
        }
        return dp[amt]>amt?-1:dp[amt];
    }
}