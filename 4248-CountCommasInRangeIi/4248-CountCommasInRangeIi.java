// Last updated: 26/03/2026, 16:16:18
class Solution {
    public long countCommas(long n) {
        long c = 0l;
        if (n > 999999999999999l) {
            c += n - 999999999999999l;
        }
        if (n > 999999999999l) {
            c += n - 999999999999l;
        }
        if (n > 999999999l) {
            c += n - 999999999l;
        }
        if (n > 999999l) {
            c += n - 999999l;
        }
        if (n > 999l) {
            c += n - 999l;
        }
        return c;
    }
}