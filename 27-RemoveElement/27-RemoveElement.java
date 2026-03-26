// Last updated: 26/03/2026, 16:24:53
class Solution {
    public int removeElement(int[] nums, int val) {
        int count =0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            nums[count++]=nums[i];  
        }
        return count;
    }
}