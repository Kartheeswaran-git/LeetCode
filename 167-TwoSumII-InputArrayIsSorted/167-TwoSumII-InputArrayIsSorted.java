// Last updated: 01/06/2026, 09:42:21
1class Solution {
2    public int[] twoSum(int[] nums, int t) {
3        int n=nums.length;
4        for(int i=0;i<n;i++)
5        {
6            for(int j=i+1;j<n;j++)
7            {
8                if(nums[i]+nums[j]==t)
9                {
10                    return new int[] {i+1,j+1};
11                }
12            }
13        }
14        return new int[] {0,0};
15    }
16}