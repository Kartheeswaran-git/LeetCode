// Last updated: 26/03/2026, 16:16:54
class Solution {
    public int differenceOfSum(int[] n) {
        int sum1=0,sum2=0;
        for(int i=0;i<n.length;i++)
        {
            sum1+=n[i];
            if(n[i]<10)
            sum2+=n[i];
            else{
                while(n[i]!=0)
                {
                    sum2+=n[i]%10;
                    n[i]/=10;
                }
            }
        }
        return sum1-sum2;
    }
}