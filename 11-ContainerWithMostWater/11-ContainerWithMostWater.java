// Last updated: 02/06/2026, 07:33:20
1class Solution {
2    public int maxArea(int[] arr) {
3        int n=arr.length-1;
4        int l=0;
5        int r=n;
6        int max=0;
7        while(l<r)
8        {
9            int w=Math.min(arr[l],arr[r]);
10            max=Math.max(max,w*n);
11            n--;
12            if(arr[l]<arr[r])
13            {
14                l++;
15            }
16            else
17            {
18                r--;
19            }
20        }
21        return max;
22    }
23}