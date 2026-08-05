// Last updated: 05/08/2026, 10:30:51
class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int p=nums[0];
        int ind=0;
        for(int i=1;i<n;i++)
        {
            if(p<nums[i])
            {
                p=nums[i];
                ind=i;
            }
        }
        return ind;
    }
}