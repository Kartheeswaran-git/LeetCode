// Last updated: 10/08/2026, 14:56:56
1class Solution {
2    public int[] sortedSquares(int[] arr) {
3        for (int i=0;i<arr.length;i++)
4        {
5            arr[i]=arr[i]*arr[i];
6        }
7        Arrays.sort(arr);
8        return arr;
9    }
10}