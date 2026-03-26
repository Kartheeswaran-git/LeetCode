// Last updated: 26/03/2026, 16:17:08
class Solution {
    public int commonFactors(int a, int b) {
        int c=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0 && b%i==0)
            c++;
        }
        return c;
    }
}