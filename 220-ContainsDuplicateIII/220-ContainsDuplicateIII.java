// Last updated: 26/05/2026, 23:20:07
1class Solution {
2    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
3        if (indexDiff <= 0 || valueDiff < 0) return false;
4
5        TreeSet<Long> window = new TreeSet<>(); 
6        for (int i = 0; i < nums.length; i++) {
7            if (i > indexDiff) {
8                window.remove((long) nums[i - indexDiff - 1]);
9            }
10            long x = nums[i];
11            long low = x - (long) valueDiff;
12            long high = x + (long) valueDiff;
13            Long candidate = window.ceiling(low);
14            if (candidate != null && candidate <= high) {
15                return true;
16            }
17            window.add(x);
18        }
19
20        return false;
21    }
22}