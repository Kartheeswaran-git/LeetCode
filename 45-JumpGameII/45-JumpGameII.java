// Last updated: 10/06/2026, 23:42:55
1class Solution {
2    public int singleNumber(int[] nums) {
3        Arrays.sort(nums);
4        int n = nums.length;
5        for (int i = 0; i < n - 1; i += 3) {
6            if (i + 1 >= n || nums[i] != nums[i + 1]) {
7                return nums[i];
8            }
9        }
10        return nums[n - 1];
11    }
12}