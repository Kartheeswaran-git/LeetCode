// Last updated: 04/06/2026, 01:53:21
1class Solution {
2    public int findKthLargest(int[] n, int k) {
3         Arrays.sort(n);
4        return n[n.length - k];
5    }
6}