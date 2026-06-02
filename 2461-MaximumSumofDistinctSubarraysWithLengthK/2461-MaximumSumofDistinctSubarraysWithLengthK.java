// Last updated: 02/06/2026, 09:47:46
1class Solution {
2    public int maxAscendingSum(int[] nums) {
3        int sum = nums[0];
4        int max = sum;
5        int n = nums.length;
6        for (int i = 1; i < n; i++) {
7            if (nums[i] > nums[i - 1]) {
8                sum += nums[i];
9                max = Math.max(sum, max);
10            } else {
11                sum = nums[i];
12            }
13        }
14        return max;
15    }
16}