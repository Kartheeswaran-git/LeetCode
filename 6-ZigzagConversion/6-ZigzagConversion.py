# Last updated: 15/06/2026, 15:24:42
1class Solution:
2    def convert(self, s: str, numRows: int) -> str:
3        n=numRows
4        if n>=len(s) or n==1:
5            return s
6        dp=[""]*n
7        r,m=0,1
8        for i in s:
9            dp[r]+=i
10            if r==0:
11                m=1
12            elif r==n-1:
13                m=-1
14            r+=m
15        return "".join(dp)