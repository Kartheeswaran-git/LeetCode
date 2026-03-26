// Last updated: 26/03/2026, 16:16:13
class Solution {
    public int numOfUnplacedFruits(int[] a, int[] b) {
        int n=a.length;
        int c=0;
        for( int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i]<=b[j])
                {
                    b[j]=0;
                    break;
                }
                
            }
        }
        for (int i=0;i<n;i++)
        {
            if(b[i]!=0)
            c++;
        }
        return c;
    }
}