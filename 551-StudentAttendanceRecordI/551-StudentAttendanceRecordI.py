# Last updated: 10/08/2026, 14:31:18
1class Solution(object):
2    def restoreString(self, s, arr):
3        ans=[None]*len(s)
4        for i in range(len(s)):
5            ans[arr[i]]=s[i]
6        a=""
7        for i in ans:
8            a+=i
9        return a
10        