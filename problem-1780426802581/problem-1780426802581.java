// Last updated: 03/06/2026, 00:30:02
1class Solution {
2    public int minPathSum(int[][] gird) {
3        int n=gird.length;
4        int m=gird[0].length;
5        for(int i=1;i<n;i++)
6        {
7            gird[i][0] += gird[i-1][0];
8        }
9        for(int i=1;i<m;i++)
10        {
11            gird[0][i] += gird[0][i-1];
12        }
13        for(int i=1;i<n;i++)
14        {
15            for(int j=1;j<m;j++)
16            {
17                gird[i][j]+=Math.min(gird[i-1][j],gird[i][j-1]);
18            }
19        }
20        return gird[n-1][m-1];
21    }
22}