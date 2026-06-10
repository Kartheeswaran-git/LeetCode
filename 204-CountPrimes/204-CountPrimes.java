// Last updated: 10/06/2026, 18:06:24
1class Solution {
2    public int countPrimes(int n) {
3        boolean[] p = new boolean[n];
4        int c=0;
5        for (int i = 2; i < n; i++) {
6            p[i] = true;
7        }
8
9        for (int i = 2;i < n; i++) {
10            if (p[i]) {
11                c++;
12                for (int j = i * 2; j < n; j += i) {
13                    p[j] = false;
14                }
15            }
16        }
17        return c;
18    }
19}