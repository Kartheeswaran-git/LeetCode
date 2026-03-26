// Last updated: 26/03/2026, 16:26:23
class Solution {
    public int maxArea(int[] arr) {
        int n = arr.length - 1;
        int l = 0;
        int r = n;
        int max = 0;
        while (l < r) {
            int w = Math.min(arr[l], arr[r]);
            max = Math.max(max, w * n);
            n--;
            if (arr[l] < arr[r]) {
                l++;
            } else {
                r--;
            }
        }
        return max;
    }
}