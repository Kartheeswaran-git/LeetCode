// Last updated: 26/03/2026, 16:18:12
class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] i=new int[n+1];
        int[] o=new int[n+1];
        if(n==1)
            return 1;
        for(int in=0;in<trust.length;in++)
        {
            o[trust[in][0]]++;
            i[trust[in][1]]++;
        }
        for(int in=0;in<=n;in++)
        {
            if(i[in]==n-1 && o[in]==0)
            return in;
        }
        return -1;
    }
}