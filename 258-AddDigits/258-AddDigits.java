// Last updated: 26/03/2026, 16:20:55
class Solution {
    public int addDigits(int num) {
        if(num%9!=0 || num==0)
        return num%9;
        else
        return 9;
    }
}