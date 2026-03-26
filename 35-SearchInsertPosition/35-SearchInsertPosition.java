// Last updated: 26/03/2026, 16:24:21
class Solution {
    public int searchInsert(int[] nums, int t) {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=t)
            break;
            c++;
        }
        return c;
    }
}