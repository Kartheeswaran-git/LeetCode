// Last updated: 26/03/2026, 16:21:43
class Solution {
    public int titleToNumber(String a) {
        int s=0;
        int len=a.length()-1;
        for(int i=0;i<a.length();i++)
        {
            s+=Math.pow(26,len)*(a.charAt(i)-64);
            len--;    
        }
        return s;
    }
}

