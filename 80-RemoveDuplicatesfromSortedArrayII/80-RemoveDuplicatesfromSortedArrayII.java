// Last updated: 03/06/2026, 09:16:09
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int n = nums.length;
4        if (n <= 2)
5            return n;
6        int j = 2;
7        for (int i = 2; i < n; i++) {
8            if (nums[i] != nums[j - 2]) {
9                nums[j] = nums[i];
10                j++;
11            }
12        }
13        return j;
14    }
15}