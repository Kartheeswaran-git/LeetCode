// Last updated: 03/06/2026, 12:29:38
1class Solution {
2    public int search(int[] nums, int t) {
3        int n = nums.length;
4
5        if (nums[0] == t)
6            return 0;
7
8        if (t >= nums[0]) {
9            int i = 0;
10
11            while (i < n - 1 && nums[i + 1] > nums[i]) {
12                if (nums[i] == t)
13                    return i;
14                i++;
15            }
16
17            if (nums[i] == t)
18                return i;
19        } else {
20            int i = n - 1;
21
22            while (i > 0) {
23                if (nums[i] == t)
24                    return i;
25                i--;
26            }
27        }
28
29        return -1;
30    }
31}