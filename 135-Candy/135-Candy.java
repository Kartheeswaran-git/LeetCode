// Last updated: 14/06/2026, 22:54:56
1class Solution {
2    public boolean containsNearbyDuplicate(int[] nums, int k) {
3        for (int i = 0; i < nums.length; i++) {
4            for (int j = i + 1; j < nums.length && j <= i + k; j++) {
5                if (nums[i] == nums[j]) {
6                    return true;
7                }
8            }
9        }
10        return false;
11    }
12}