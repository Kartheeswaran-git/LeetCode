// Last updated: 26/03/2026, 16:18:17
class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        else if(n==1) return 1;
        else{
            int sum1=0,sum2=1,sum=0;
            for(int i=1;i<n;i++)
            {
                sum=sum1+sum2;
                sum1=sum2;
                sum2=sum;
            }
            return sum;
        }
    }
}