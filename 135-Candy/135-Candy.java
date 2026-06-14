// Last updated: 14/06/2026, 21:12:39
1class Solution {
2    public int candy(int[] arr) {
3        int n = arr.length;
4        int cnt = 0;
5        int[] c = new int[n];
6        for (int i = 0; i < n; i++) c[i] = 1;
7        for (int i = 1; i < n; i++)
8            if (arr[i] > arr[i - 1])
9                c[i] = c[i - 1] + 1;
10        for (int i = n - 1; i > 0; i--) {
11            if (arr[i - 1] > arr[i])
12                c[i - 1] = Math.max(c[i] + 1, c[i - 1]);
13            cnt += c[i - 1];
14        }
15        return cnt + c[n - 1];
16    }
17}