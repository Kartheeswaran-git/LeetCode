// Last updated: 05/08/2026, 10:31:35
class Solution {
    public int maxProfit(int[] nums) {
        int p=0;
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
            if(nums[i-1]<nums[i])
            {
                p+=nums[i]-nums[i-1];
            }
        }
        return p;
    }
}