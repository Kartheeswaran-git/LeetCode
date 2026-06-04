// Last updated: 05/06/2026, 01:20:51
1class Solution {
2    public int climbStairs(int n) {
3        if (n <= 3) return n;
4
5        int prev1 = 3;
6        int prev2 = 2;
7        int cur = 0;
8
9        for (int i = 3; i < n; i++) {
10            cur = prev1 + prev2;
11            prev2 = prev1;
12            prev1 = cur;
13        }
14
15        return cur;        
16    }
17}