// Last updated: 26/03/2026, 16:21:06
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        if(n == 1) return true;

        while(n % 2 == 0) {
            n /= 2;
            if(n == 1) return true;
        }

        return false;
    }
}