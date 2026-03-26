// Last updated: 26/03/2026, 16:19:26
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int res[] = new int[m * n];
        int r = 0, c = 0;
        for (int i = 0; i < m * n; i++) {
            res[i] = mat[r][c];

            if ((r + c) % 2 == 0) {
                if (c == n - 1) {
                    r++;
                } else if (r == 0) {
                    c++;
                } else {
                    r--;
                    c++;
                }
            } else {
                if (r == m - 1) {
                    c++;
                } else if (c == 0) {
                    r++;
                } else {
                    r++;
                    c--;
                }
            }
        }
        return res;
        //     int n=mat.length;
        //     int m=mat[0].length;
        //     int[] arr =new int[n*m];
        //     int t=0;
        //     arr[0]=mat[0][0];   
        //     for(int k=1;k<n;k++)             
        //     for(int i=0;i<n;i++)
        //     {
        //         for(int j=0;j<m;j++)
        //         {
        //             if(k==i+j)
        //             {
        //                 arr[t++]=mat[i][j];
        //             }
        //         }
        //     }
        //     return arr;
    }
}