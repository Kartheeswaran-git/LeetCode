// Last updated: 26/03/2026, 16:18:05
class Solution {
    public int tribonacci(int n) {
        int a=0,b=1,c=1,sum=0;
        if(n==1||n==2) return 1;
        if(n==0) return 0;
        for(int i=2;i<n;i++)
        {
            sum=a+b+c;
            a=b;
            b=c;
            c=sum;
        }
        return sum;
    }
}