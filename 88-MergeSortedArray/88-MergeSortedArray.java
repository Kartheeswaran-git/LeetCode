// Last updated: 05/06/2026, 23:41:14
1class Solution {
2    public void merge(int[] n1, int m, int[] n2, int n) {
3        for(int i=m,j=0;i<n1.length;i++)
4        {
5            n1[i]=n2[j];
6            j++;
7        }
8        Arrays.sort(n1);
9    }
10}