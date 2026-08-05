// Last updated: 05/08/2026, 10:29:14
import java.util.Arrays;

class Solution {
    public int hIndex(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int h = 0;
        for (int i = 0; i < n; i++) {
            int p = n - i;
            if (arr[i] >= p) {
                h = p;
                break;
            }
        }
        return h;
    }
}