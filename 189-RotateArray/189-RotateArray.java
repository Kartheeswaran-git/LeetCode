// Last updated: 05/08/2026, 10:30:29
// class Solution {
//     public void rotate(int[] nums, int k) {
//         int n = nums.length;
//         k = k % n;
//         for (int i = 0; i < k; i++) {
//             int t = nums[n - 1];
//             for (int j = n - 1; j > 0; j--) {
//                 nums[j] = nums[j - 1];
//             }
//             nums[0] = t;
//         }
//     }
// }

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        int a = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            if (n - k + a < n)
                arr[i] = nums[n - k + a++];
            else
                arr[i] = nums[(n - k + a++) % n];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = arr[i];
        }
    }
}