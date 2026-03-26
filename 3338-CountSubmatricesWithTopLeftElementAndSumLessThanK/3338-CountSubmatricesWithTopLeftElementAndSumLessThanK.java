// Last updated: 26/03/2026, 16:16:25
class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int count=0;
        int r=grid.length;
        int c=grid[0].length;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i>0)
                {
                    grid[i][j]+=grid[i-1][j];
                }
                if(j>0)
                {
                    grid[i][j]+=grid[i][j-1];
                }
                if(i>0 && j>0)
                {
                    grid[i][j]-=grid[i-1][j-1];
                }
                if(grid[i][j]<=k)
                {
                    count++;
                }
            }
        }        
        return count;
    }
}