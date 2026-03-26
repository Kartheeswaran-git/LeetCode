// Last updated: 26/03/2026, 16:17:59
class Solution {
    public int subtractProductAndSum(int n) {
        int num=n,s=0;
        int p=1;
        while(n!=0)
        {
            p*=n%10;
            n/=10;
        }
        while(num!=0){
            s+=num%10;
            num/=10;
        }
        return p-s;
    }
}