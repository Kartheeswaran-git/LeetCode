// Last updated: 26/03/2026, 16:26:26
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;
        else{
            int rev=0,num=x;
            while(num!=0){
                rev*=10;
                rev+=num%10;
                num/=10;
            }
            return(x==rev)?true:false;
        }
    }
}