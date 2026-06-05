// Last updated: 05/06/2026, 23:53:52
1class Solution {
2    public int removeElement(int[] nums, int val) {
3        int count =0;
4        for(int i=0;i<nums.length;i++)
5        {
6            if(nums[i]!=val)
7            nums[count++]=nums[i];  
8        }
9        return count;
10    }
11}