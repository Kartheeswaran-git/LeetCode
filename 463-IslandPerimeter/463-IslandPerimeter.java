// Last updated: 05/08/2026, 10:28:26
class Solution {
    public int islandPerimeter(int[][] arr) 
    {
        int n = arr.length;
        int m = arr[0].length;
        int c = 0;

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(arr[i][j] == 1)
                {
                    if(i == 0)
                        c++;
                    else if(arr[i-1][j] == 0)
                        c++;
                    if(j == 0)
                        c++;
                    else if(arr[i][j-1] == 0)
                        c++;
                    if(j == m-1)
                        c++;
                    else if(arr[i][j+1] == 0)
                        c++;
                    if(i == n-1)
                        c++;
                    else if(arr[i+1][j] == 0)
                        c++;
                }
            }
        }
        return c;
    }
}