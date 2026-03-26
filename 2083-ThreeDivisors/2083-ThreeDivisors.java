// Last updated: 26/03/2026, 16:17:33
class Solution {
    public boolean isThree(int n) {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
        return(c==3)?true:false;
    }
}