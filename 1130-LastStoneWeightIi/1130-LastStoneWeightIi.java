// Last updated: 26/03/2026, 16:18:09
class Solution {
    Integer[][] dp;
    public int solve(int[] nums, int target, int i){
        if(i>=nums.length){
            return target>=0? 0 : Integer.MIN_VALUE;
        }

        if(dp[i][target]!=null) return dp[i][target];

        int a = Integer.MIN_VALUE;
        if(target-nums[i]>=0){
            a = nums[i] + solve(nums, target-nums[i], i+1);
        }
        int b = solve(nums, target, i+1);

        int ans = Math.max(a, b);
        return dp[i][target] = ans;
    }
    public int lastStoneWeightII(int[] stones) {
        int n = stones.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += stones[i];
        }

        int target = sum/2;

        dp = new Integer[stones.length][target+1];
        int S1 = solve(stones, target, 0);
        int S2 = sum-S1;

        return Math.abs(S1-S2);
    }
}