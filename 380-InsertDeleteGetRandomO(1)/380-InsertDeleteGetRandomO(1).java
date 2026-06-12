// Last updated: 12/06/2026, 23:35:39
1import java.util.Arrays;
2
3class Solution {
4    public int hIndex(int[] arr) {
5        Arrays.sort(arr);
6        int n = arr.length;
7        int h = 0;
8        for (int i = 0; i < n; i++) {
9            int p = n - i;
10            if (arr[i] >= p) {
11                h = p;
12                break;
13            }
14        }
15        return h;
16    }
17}