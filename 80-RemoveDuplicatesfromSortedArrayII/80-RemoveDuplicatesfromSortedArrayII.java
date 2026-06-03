// Last updated: 03/06/2026, 10:12:39
1// class Solution {
2//     public void rotate(int[] nums, int k) {
3//         int n = nums.length;
4//         k = k % n;
5//         for (int i = 0; i < k; i++) {
6//             int t = nums[n - 1];
7//             for (int j = n - 1; j > 0; j--) {
8//                 nums[j] = nums[j - 1];
9//             }
10//             nums[0] = t;
11//         }
12//     }
13// }
14
15class Solution {
16    public void rotate(int[] nums, int k) {
17        int n = nums.length;
18        k = k % n;
19
20        int a = 0;
21        int[] arr = new int[n];
22
23        for (int i = 0; i < n; i++) {
24            if (n - k + a < n)
25                arr[i] = nums[n - k + a++];
26            else
27                arr[i] = nums[(n - k + a++) % n];
28        }
29
30        for (int i = 0; i < n; i++) {
31            nums[i] = arr[i];
32        }
33    }
34}