// Last updated: 26/03/2026, 16:21:33
class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += (n & 1);
            n >>>= 1;  
        }
        return count;
    }
}
