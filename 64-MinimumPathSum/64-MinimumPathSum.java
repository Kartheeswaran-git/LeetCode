// Last updated: 05/08/2026, 10:32:32
class Solution {
    public int minPathSum(int[][] gird) {
        int n=gird.length;
        int m=gird[0].length;
        for(int i=1;i<n;i++)
        {
            gird[i][0] += gird[i-1][0];
        }
        for(int i=1;i<m;i++)
        {
            gird[0][i] += gird[0][i-1];
        }
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                gird[i][j]+=Math.min(gird[i-1][j],gird[i][j-1]);
            }
        }
        return gird[n-1][m-1];
    }
}