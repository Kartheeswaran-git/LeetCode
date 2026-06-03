// Last updated: 03/06/2026, 11:45:29
1class Solution {
2    public int maxProfit(int[] arr) {
3        int s=0;
4        int b=arr[0];
5        for(int i=1;i<arr.length;i++)
6        {
7            if(arr[i]<b)
8                b=arr[i];
9            else if(arr[i]-b>s)
10                s=arr[i]-b;
11        }
12        return s;
13    }
14}