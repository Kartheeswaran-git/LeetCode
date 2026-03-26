// Last updated: 26/03/2026, 16:16:27
class Solution {
    public int minOperations(int[] nums, int k) {
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<k)
            s++;
        }
        return s;
    }
}