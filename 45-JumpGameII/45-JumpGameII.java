// Last updated: 10/06/2026, 21:39:21
1class Solution {
2    public int jump(int[] nums) {
3        int n = nums.length;
4        if (n <= 1) return 0;
5
6        int j = 0;
7        int c = 0;
8        int max = 0;
9        for (int i = 0; i < n - 1; i++) {
10            max = Math.max(max, i + nums[i]);
11            if (i == c) {
12                j++;
13                c = max;
14                if (c >= n - 1) break;
15            }
16        }
17        return j;
18    }
19}