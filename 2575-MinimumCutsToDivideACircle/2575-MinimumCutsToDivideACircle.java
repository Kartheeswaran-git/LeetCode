// Last updated: 26/03/2026, 16:16:57
class Solution {
    public int numberOfCuts(int n) {
        if (n==1)
        return 0;
        else if(n%2==0)
        return n/2;
        else
        return n;
    }
}