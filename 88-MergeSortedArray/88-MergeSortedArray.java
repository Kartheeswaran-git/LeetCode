// Last updated: 06/06/2026, 00:06:37
1class Solution {
2    public int removeDuplicates(int[] n) {
3        int j = 0;
4        for (int i = 1; i < n.length; i++) {
5            if (n[j] != n[i]) {
6                n[++j] = n[i];
7                
8            }
9        }
10        return j+1;
11    }
12}