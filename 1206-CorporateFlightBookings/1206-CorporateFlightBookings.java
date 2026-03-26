// Last updated: 26/03/2026, 16:18:06
class Solution {
    public int[] corpFlightBookings(int[][] arr, int n) {
        int[] r=new int [n];
        int s=0;
        int e=0;
        int val=0;
        for(int i=0;i<arr.length;i++)
        {
            s=arr[i][0]-1;
            e=arr[i][1]-1;
            val=arr[i][2];
            r[s]+=val;
            if(e+1<n)
                r[e+1]-=val;
        }
        int p[]=new int[n];
        p[0]=r[0];

        for(int i=1;i<n;i++)
        {
            p[i]=p[i-1]+r[i];
        }
        return p;
    }
}